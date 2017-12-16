
package rg_HuoShan.YongHu.MoRen;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;

public class rg_QiDongLei extends rg_HuoShan.AnZhuo.JiTong.AndroidActivity  {
    public rg_QiDongLei ()  { }
    protected rg_HuoShan.AnZhuo.ChuangKou.rg_BiaoQian1 rg_BiaoQian;
    protected rg_HuoShan.AnZhuo.ChuangKou.rg_XianXingBuJuQi rp_1;
    @Override
    public rg_HuoShan.AnZhuo.ChuangKou.AndroidViewGroup GetAndroidActivityContainer () {
        return rp_1;
    }
    @Override
    protected boolean onInitAndroidActivity () {
        ms_blMainActivityLoaded = true;
        if (super.onInitAndroidActivity () == false)
            return false;
        setContentView (R.layout.rg_qidonglei);
        rp_1 = new rg_HuoShan.AnZhuo.ChuangKou.rg_XianXingBuJuQi ((LinearLayout)findViewById (R.id.rg_qidonglei));

        rg_BiaoQian = new rg_HuoShan.AnZhuo.ChuangKou.rg_BiaoQian1 ((TextView)findViewById (R.id.rg_biaoqian));
        return true;
    }
}
