using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace Login
{
    public partial class Login : System.Web.UI.Page
    {
        //字段模拟全局逻辑型变量
        public static bool b = false;

        protected void Page_Load(object sender, EventArgs e)
        {
        }

        protected void Button1_Click(object sender, EventArgs e)
        {
            if (TextBox1.Text == "Str" && TextBox2.Text == "233")
            {
                Label3.Text = "正确";
                b = true;

            }
            else if (TextBox1.Text == "" || TextBox2.Text == "")
            {
                Label3.Text = "不能为空";
            }
            else
            {
                Label3.Text = "错误";
            }
        }

        protected void TextBox2_TextChanged(object sender, EventArgs e)
        {
            //TextBox2.TextMode = TextBoxMode.Password;
            //TextBox2.TextMode = TextBoxMode.SingleLine;
        }
    }
}