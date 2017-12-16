
package rg_HuoShan.AnZhuo.ChuangKou;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;

public abstract class AndroidViewGroup extends AndroidView  {
    public AndroidViewGroup ()  { }
    public AndroidViewGroup (ViewGroup vg) { super (vg); }
    public void rg_TianJiaZuJian (AndroidView rg_YuTianJiaZuJian, AndroidView rg_WeiZhiZuJian)  {
        ViewGroup vg = (ViewGroup)getView ();
        View viewAdd = rg_YuTianJiaZuJian.getView ();
        final int nIndex = (rg_WeiZhiZuJian == null ? -1 : vg.indexOfChild (rg_WeiZhiZuJian.getView ()));
        if (nIndex == -1)
            vg.addView (viewAdd);
        else
            vg.addView (viewAdd, nIndex);
    }
}
