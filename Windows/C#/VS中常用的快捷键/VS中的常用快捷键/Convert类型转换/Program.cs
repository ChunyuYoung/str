using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Convert类型转换
{
    class Program
    {
        static void Main(string[] args)
        {
            //显示类型转换,自动类型转换
            //int--double 小类型转换大类型 自动转化 隐式类型转换
            //double--int 大类型转化小类型 强制转换 显式类型转换

            //string s = "123";
            ////将字符串转换成int或者double类型

            //double d= Convert.ToDouble(s);
            //int n= Convert.ToInt32(s);
            //Console.WriteLine(n);
            //Console.WriteLine(d);
            //Console.ReadKey();

            //让用户输入姓名,语文,数学,英语,三门壳的成绩
            //然后让用户显示:xx,你的总成绩为xx分,平均成绩为xx分
            Console.WriteLine("请输入你的姓名");
            string name = Console.ReadLine();
            Console.WriteLine("请输入你的语文成绩");
            string strChinese = Console.ReadLine();
            Console.WriteLine("请输入你的数学成绩");
            string strMath = Console.ReadLine();
            Console.WriteLine("请输入你的英语成绩");
            string strEnglish = Console.ReadLine();
            //由于字符串相加的话,最终会变成像连接,如果要那自负串类型的变量参与计算
            //余姚将字符串转换成int或者double类型
            int chinese =Convert.ToInt32(strChinese);
            int math = Convert.ToInt32(strMath);
            int english = Convert.ToInt32(strEnglish);

            Console.WriteLine("{0}你的总成绩是{1},平均成绩是{2}", name, chinese + math + english, (chinese + math + english) / 3);
            Console.ReadKey();
        }
    }
}
