using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace 算术运算符
{
    class Program
    {
        /// <summary>
        /// 算数运算符的运用
        /// </summary>
        /// <param name="args"></param>
        static void Main(string[] args)
        {
            //练习1
            int a = 100;                                //第一个加数
            int b = 20;                                 //第二个加数
            Console.WriteLine("a+b={0}", a + b);        //求a+b的和
            Console.ReadKey();                          //输入任意键继续

            //练习2
            double pi = 3.14;                           //定义π值
            int r = 5;                                  //定义圆的半径为5
            Console.WriteLine("圆的面积为:{0},圆的周长为:{1}", pi * r * r, 2 * pi * r);   //计算圆的半径和周长
            Console.ReadKey();                          //输入任意键继续

            //练习3
            int T_shirt = 35;                           //体恤衫的单价是35元
            int Trousers = 120;                         //裤子的单价是120元
            Console.WriteLine("小明秒了3件T恤衫和两条裤子_总计:{0}元,打8.8折_总计:{1}", (3 * T_shirt) + (2 * Trousers), ((3 * T_shirt) + (2 * Trousers)) * 0.88);      //3件体恤衫和3件裤子总价格 和 计算总价格打8.8折后的价格
            Console.ReadKey();                          //输入任意键继续

            //int number = 10;
            //double d = number;  //自动类型转换 隐式类型转换

            double d = 303.6;   //double--int //强制类型转换 显示类型转换
            int n=(int)d;
            Console.WriteLine("n={0}", n);
            Console.ReadKey();

        }
    }
}
