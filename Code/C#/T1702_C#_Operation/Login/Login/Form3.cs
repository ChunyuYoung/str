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
    public partial class Form3 : Form  
    {
        public int score = 0;
        public Form3()
        {
            InitializeComponent();
        }

        private void Form3_Load(object sender, EventArgs e)
        {
            int n;
            Random r = new Random();
            n = r.Next(10);
            label1.Text = n.ToString();
            n = r.Next(10);
            label3.Text = n.ToString();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            if (int.Parse(label1.Text) + int.Parse(label3.Text) == int.Parse(textBox1.Text))
            {
                MessageBox.Show("答对了:加10分");
                score += 10;
            }
            else
            {
                MessageBox.Show("错了,不加分");
            }
        }

        private void button2_Click(object sender, EventArgs e)
        {
            int n;
            Random r = new Random();
            n = r.Next(10);
            label1.Text = n.ToString();
            n = r.Next(10);
            label3.Text = n.ToString();
            textBox1.Text = "";
        }

        private void button3_Click(object sender, EventArgs e)
        {
            MessageBox.Show("你的成绩是" + score + "分");
        }
    }
}
