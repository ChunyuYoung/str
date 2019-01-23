//GameList.java
package com.str.game;

public class GameList {
	//游戏启动器主界面
	public void List() {
		//游戏标题
		System.out.println("Game Caption:\t\t\tFlash & Brower Games Offline\t\t\tVersion:0.1.3");
		//列表头部
		for(int i=0;i<100;i++)
			System.out.print("=");
		System.out.println("\n"); 			//换行
		//列表中部
		for(int i=0;i<5;i++) {
			for(int j=0;j<35;j++) {
				System.out.print(" ");
			}
			//列表项目
			if(i==0)
				System.out.println("1.勇者之路精灵物语速升版");
			else if(i==1)
				System.out.println("2.黄金矿工双人版");
			else if(i==2)
				System.out.println("3.疯狂小人战斗");
			else if(i==3)
				System.out.println("4.高楼爆破");
			else if(i==4)
				System.out.println("5.双刃战士");
		}
		System.out.println();		//换行
		//列表尾部
		for(int i=0;i<100;i++)
			System.out.print("=");	//画游戏列表底部边框
		System.out.println(); 		//换行
	}
}
