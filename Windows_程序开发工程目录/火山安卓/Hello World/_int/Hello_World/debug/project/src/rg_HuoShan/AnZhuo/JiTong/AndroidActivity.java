
package rg_HuoShan.AnZhuo.JiTong;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;

public abstract class AndroidActivity extends android.app.Activity  {
    @Override
    protected void onCreate (android.os.Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        if (onInitAndroidActivity () == false)  
            finish ();  
        else
            rg_TongZhi_BeiChuangJian ();
    }
    protected static boolean ms_blMainActivityLoaded = false;  
    protected boolean onInitAndroidActivity () {  
        
        if (ms_blMainActivityLoaded == false) {  
            
            try  {
                android.content.Intent intent = new android.content.Intent ();
                intent.setClass (this, rg_HuoShan.YongHu.MoRen.rg_QiDongLei.class);
                startActivity (intent);
            } catch (Exception e) { }
            return false;  
        }
        return true;  
    }
    public rg_HuoShan.AnZhuo.ChuangKou.AndroidViewGroup GetAndroidActivityContainer ()  {
        return (null);
    }
    public void rg_TongZhi_BeiChuangJian ()  {
    }
    public void onStart ()  {
        super.onStart ();
    }
    public void onRestart ()  {
        super.onRestart ();
    }
    public void onResume ()  {
        super.onResume ();
    }
    public void onPause ()  {
        super.onPause ();
    }
    public void onStop ()  {
        super.onStop ();
    }
    public void onDestroy ()  {
        super.onDestroy ();
    }
    public boolean rg_ZaiRuChuangKou (String rg_YuZaiRuChuangKouLeiShuChuMing)  {
        try  {
            android.content.Intent intent = new android.content.Intent ();
            intent.setClassName (this, rg_YuZaiRuChuangKouLeiShuChuMing);
            startActivity (intent);
            return true;
        } catch (Exception e) { }
        return false;
    }
    public void rg_GuanBi ()  {
        finish ();
    }
}
