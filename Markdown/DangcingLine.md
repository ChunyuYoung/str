# 小白实战-->跳舞的线<--逆向分析
* 正好我最近学习了C,C#,JAVA,HTML语言,所以知道了**跳舞的线**是Unity 3D游戏后,我看了dalao的帖子也来练练手
## 修改游戏金币(价钱/游戏通用货币)
1. 使用**解压缩文件**打开APK的``\com.cmplay.dancingline.apk\assets\bin\Data\Managed``目录解压所有dll文件
2. 一般情况下将``Assembly-CSharp.dll``和``Assembly-CSharp-firstpass.dll``文件复制到dnsy工具里
	* 我发现直接把这两个文件复制到**dnsy**中编辑代码在编译dll时会报错,目前我的解决方式是吧所有**dll**文件全部拖放到**dnsy**里
3. 直接打开``Assembly-CSharp.dll``文件-->``{} - ``列表-->ShopPanel-->Buy
``` C#
// ShopPanel
// Token: 0x060010BA RID: 4282 RVA: 0x000143FB File Offset: 0x000125FB
public void Buy()
{
	//可以看到这里的BuyHead是游戏购买的货币的方法
	if (!this.BuyHead(this.currentLineParams.Type))
	{
		GameController.Instance.SetGameState(GameState.COINS_STORE, new object[0]);
	}
}	
```
4. 打开BuyHead方法,右键方法内部选择``Edit Method``
``` C#
	// Token: 0x060010BD RID: 4285 RVA: 0x00078CE4 File Offset: 0x00076EE4
	public bool BuyHead(LineCustomizationNames type)
	{
		this.lastBuyedLineParams = LineCustomizationController.Instance.GetLineParams(type);
		if (this.lastBuyedLineParams == null)
		{
			UnityEngine.Debug.LogError("BuyHead: LINE == NULL; " + type.ToString());
			return false;
		}
		if (!string.IsNullOrEmpty(this.lastBuyedLineParams.InappName))
		{
			if (StoreController.AreInappsReady)
			{
				StoreController.BuyInApp(this.lastBuyedLineParams.InappName, false);
			}
			else
			{
				StoreController.ShowNotAvailablePopUp();
				this.lastBuyedLineParams = null;
			}
			return true;
		}
		//可以看到price是价钱的意思,后面的表达式很明显就是向价钱这个变量赋值
		int price = LineCustomizationController.Instance.GetPrice(type);
		//当玩家的货币不等于-1且物品的价格大于玩家的金币总量
		if (price != -1 && CoinsController.Instance.Coins >= price)
		{
			LineCustomizationController.Instance.Unlock(type, UnlockLineSource.Coins);
			CoinsController.Instance.DecreaseCoins(price, EventsDataNames.CurrencyFields.ConsumeSources.BuySkin, true);
			this.SelectHead(type);
			if (this.HeadBoughtEvent != null)
			{
				this.HeadBoughtEvent(type);
			}
			return true;
		}
		this.lastBuyedLineParams = null;
		return false;
	}
```
5. 打开这其中的关键就是这个CoinsController,找到``Coins``方法,可以看到这里面包含两个方法``get_Coins``和``set_Coins``
``` C#
// Monetyzation.CoinsController
// Token: 0x17000291 RID: 657
// (get) Token: 0x060015B1 RID: 5553 RVA: 0x0008C214 File Offset: 0x0008A414
// (set) Token: 0x060015B2 RID: 5554 RVA: 0x00017D8F File Offset: 0x00015F8F
public int Coins
{
	//获取金币的方法
	get
	{
		//如果金币等于-1
		if (this._coins == -1)
		{
			if (!UserDataManager.Instance.LoadBool("coinsIniatializedBefore", false, false))
			{
				UserDataManager.Instance.Save("coinsIniatializedBefore", true, false);
				//设置玩家的金币为0
				this._coins = 0;
				UserDataManager.Instance.Save("currentCoins", this._coins, false);
			}
			else
			{
				this._coins = UserDataManager.Instance.LoadInt("currentCoins", 0, false);
			}
		}
		//返回金币
		return 54188;
	}
	//设置金币的方法
	private set
	{
		//如果金币的数量不等于购买所需的数量
		if (this._coins != value)
		{
			this._coins = value;
			if (this._coins < 0)
			{
				this._coins = 0;
			}
			//玩家数据存储,并设置金币
			UserDataManager.Instance.Save("currentCoins", 54188, false);
		}
	}
}
```
6. 可以测试一下是否成功,得先保存一下dll文件,选择菜单中的**保存模块**然后把修改后的文件``Assembly-CSharp.dll``替换到apk中
7. 使用AndroidKiller-->签名-->签名方式使用AndroidKiller
8. 签名之后发到物理机上或者模拟器中测试
## 去除-->跳舞的线<--广告
1. 打开``Assembly-CSharp.dll``
2. 打开``{} - ``列表
3. 看到前面会有很多的Ad开头的单词,找到``AdsController``可以看到这个翻译过来就是广告管理
4. 然后把下面每一个方法都点开看一下,当我看到了``DisplayInterstitial(AdsType)``
``` C#
// AdsController
// Token: 0x06001AF2 RID: 6898 RVA: 0x0009FC60 File Offset: 0x0009DE60
public void DisplayInterstitial(AdsType adsType = AdsType.Normal)
{
	//这里的if()表达式可能是一个bool型
	if (this.AreAdsBlocked)
	{
		//可以看到这里非常明显,这是判断是否已经购买了去除广告的权限
		Debug.Log("[DisplayInterstitial] 已经购买了去广告相关的");
		return;
	}
	bool canShowInterstitialToday = this.canShowInterstitialToday;
	if (canShowInterstitialToday)
	{
		ChannelUtility.Instance.PrepareAd(2);
		this.currentAdsType = adsType;
		if (adsType != AdsType.Normal)
		{
			if (adsType == AdsType.SpecialLevelStart)
			{
				this.InterstitialSceneID = 10;
				ChannelUtility.Instance.ShowAd(2);
				this.InterstitialAddDisplayed(string.Empty, 0);
				Debug.Log("[ShowDisplayInterstitial] 特殊关卡播放插屏");
			}
		}
		else
		{
			this.InterstitialSceneID = 1;
			LevelBase currentLevel = LevelsController.INSTANCE.CurrentLevel;
			int num;
			float num2;
			if (currentLevel != null && currentLevel.CurrentStarID + 1 > 0)
			{
				num = this.interstitialIntervalByCubesAfterRescue;
				num2 = this.intersisialTimeIntervalByCubesAfterRescue;
			}
			else
			{
				num = this.interstitialIntervalByCubes;
				num2 = this.intersisialTimeIntervalByCubes;
			}
			this.canShowInterstitial = (this.interstitialIntervalCounter >= num);
			if (this.canShowInterstitial && Time.realtimeSinceStartup >= this.lastTimeInterstitialShowed + num2)
			{
				this.isShowInterstitial = false;
				ChannelUtility.Instance.ShowAd(2);
				this.InterstitialAddDisplayed(string.Empty, 0);
				Debug.Log("[ShowDisplayInterstitial] isShowInterstitial = " + this.isShowInterstitial);
			}
		}
	}
}
```
5. 打开``AreAdsBlocked``
``` C#
	// Token: 0x17000369 RID: 873
	// (get) Token: 0x06001AED RID: 6893 RVA: 0x0001BCB6 File Offset: 0x00019EB6
	public bool AreAdsBlocked
	{
		//获取购买广告权限
		get
		{
			//返回一个bool型
			return this.OldAreAdsBlocked || UserDataManager.Instance.LoadBool("AreAdsBlockedNew", false, false) || UserDataManager.Instance.LoadBool("AreAdsBlockedTemporarily", false, false);
		}
	}
```
6. 这里直接改成``return true``
7. 文件-->保存模块-->替换模块到Apk文件-->使用AndrodKiller签名-->测试
8. 下载地址:[跳舞的线 密码:83ru](https://www.lanzous.com/b544977)
	* 由于网盘特殊限制单文件最大上传大小:100MB以内,所以文件被分割为单个50MB
