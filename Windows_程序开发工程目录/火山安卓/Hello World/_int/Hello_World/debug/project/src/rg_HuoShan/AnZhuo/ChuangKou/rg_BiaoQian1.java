
package rg_HuoShan.AnZhuo.ChuangKou;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;

public class rg_BiaoQian1 extends AndroidView  {
    public rg_BiaoQian1 ()  { }
    public rg_BiaoQian1 (TextView view) { super (view); }
    public String rg_QuNeiRong ()  {
        return ((TextView)getView ()).getText ().toString ();
    }
    public void rg_NeiRong (String rg_YuSheZhiDeWenBenNeiRong)  {
        ((TextView)getView ()).setText (rg_YuSheZhiDeWenBenNeiRong);
    }
    public void rg_TianJiaNeiRong (String rg_YuTianJiaDeWenBenNeiRong)  {
        ((TextView)getView ()).append (rg_YuTianJiaDeWenBenNeiRong);
    }
}
