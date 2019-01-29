using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace 关系表达式
{
    class Program
    {
        /// <summary>
        /// 关系表达式
        /// 布尔类型的运算
        /// I/O函数的嵌套操作
        /// </summary>
        /// <param name="args"></param>
        static void Main(string[] args)
        {
            #region
            Console.WriteLine("进行下一次输入的时候请按下\"Enter\"键");
            //大象的重量是1500 > 老鼠的重量1
            Console.WriteLine("大象的重量是1500>老鼠的重量1");
            bool b = 1500 > 1;
            Console.WriteLine(b);
            Console.ReadKey();

            //关系表达式的结果是bool类型
            //兔子的寿命3 > 乌龟的寿命1000
            Console.WriteLine("兔子的寿命3>乌龟的寿命1000");
            bool c = 3 > 1000;
            Console.WriteLine(c);
            Console.ReadKey();

            //39岁 < 18岁
            Console.WriteLine("39岁<18岁");
            bool d = 39 < 18;
            Console.WriteLine(d);
            Console.ReadKey();

            //我的年龄20 == 你的年龄20
            Console.WriteLine("我的年龄20==你的年龄20");
            bool e = 20 == 20;
            Console.WriteLine(e);
            Console.ReadKey();
            #endregion

            //让用户输入老苏的语文和数学成绩,输出一下判断是否正确,正确输出True,错误输出False
            //老苏的语文和数学成绩都大于90分
            Console.WriteLine("小苏,输入你的语文成绩");
            int chinese = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("小苏,请输入你的数学成绩");
            int math = Convert.ToInt32(Console.ReadLine());
            bool a = chinese > 90 && math > 90;
            Console.WriteLine(a);
            Console.ReadKey();

        }
    }
}
