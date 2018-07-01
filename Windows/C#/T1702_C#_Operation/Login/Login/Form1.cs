using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Login
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            //判断用户名和口令是否为空
            if (textBox1.Text == "" || textBox2.Text == "") //为空
            {
                //Console.WriteLine("用户名或者口令为空!");
                MessageBox.Show("错误:用户名或者口令为空!");
            }
            else    //不为空
            {
                if (textBox1.Text == "STR" && textBox2.Text == "T1702")     
                {
                    MessageBox.Show("登陆成功");
                    Form2 f2 = new Form2();
                    f2.Show();
                    f2.Text = "欢迎" + textBox1.Text;
                    this.Hide();
                }
                else
                {
                    MessageBox.Show("登陆失败");
                }
            }

        }
    }
}
