
package rg_HuoShan.AnZhuo.ChuangKou;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;

public class AndroidView extends rg_HuoShan.AnZhuo.JiBen.rg_BiaoShiFuLei  {
    public AndroidView ()  { }
    public AndroidView (View view) {  
        m_view = view;
        if (view != null)
            onInitView ();
    }
    public View getView () {
        return m_view;
    }
    protected void onInitView () {
        m_view.setOnClickListener (
            new View.OnClickListener () {
                public void onClick (View v) {
                    rg_BeiChanJi ();
                }
            });
    }
    private View m_view;  
    public static interface re_BeiChanJi  {
        int dispatch (AndroidView objSource);
    }
    protected re_BeiChanJi rd_BeiChanJi;
    public void rl_AndroidView_BeiChanJi (re_BeiChanJi objListener)  {
        rd_BeiChanJi = objListener;
    }
    public int rg_BeiChanJi ()  {
        if (rd_BeiChanJi != null)
            return rd_BeiChanJi.dispatch (this);
        else
            return 0;
    }
}
