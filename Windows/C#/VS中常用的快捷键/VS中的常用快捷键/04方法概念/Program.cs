using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _04方法概念
{
    class Program
    {
        static void Main(string[] args)
        {
            #region 练习1:声明一个方法来判断输入的是否为整数
            //练习1:读取输入的整数,定义成方法,多次调用(如果用户输入的是数字
            //则返回,否则提示用户重新输入
            int n1 = 0;
            Console.WriteLine("获取一个整数:(判断输入的是否是整数)");
            Console.WriteLine(Program.Number(n1));
            //Console.ReadKey();
            Console.WriteLine("第一个练习题完成!\n");
            #endregion
            #region 练习2:只允许用户输入y/n
            //练习2:还记得学循环时做的那道题吗?只允许用户输入y或n,请改成方法
            string s1 = "";
            Console.WriteLine("请输入y(写代码)/n(造世界)");
            Console.WriteLine(Program.S1(s1));
            //Console.ReadKey(); 
            Console.WriteLine("第二个练习题完成!\n");
            #endregion
            #region 练习3:比较两个整数中之最大的值
            //练习3:查找两个整数中的最大值:intMax(int i1,int i2)
            Console.WriteLine("请输入两个整数:(计算最大值)");
            int num1 = 0;
            int num2 = 0;
            num1 = int.Parse(Console.ReadLine());
            num2 = int.Parse(Console.ReadLine());
            Console.WriteLine("最大值是:" + Program.decNumber(num1, num2));
            //Console.ReadKey();
            Console.WriteLine("第三个练习题完成!\n");
            #endregion
            #region 练习4:计算数组元素之和
            //练习4:计算输入数组的和:int Sum(int[] values)
            int Num = 0;
            Console.WriteLine("数组之和为:" + Program.arrayNum(Num));
            Console.ReadKey(); 
            #endregion
        }
        #region 方法:计算数组元素之和
        /// <summary>
        /// 计算数组元素之和
        /// </summary>
        /// <param name="Num">数组元素之和</param>
        /// <returns>返回数组元素之和</returns>
        public static int arrayNum(int Num)
        {
            int[] aryNum = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
            for (int i = 0; i < aryNum.Length; i++)
            {
                Num += aryNum[i];
            }
            return Num;
        } 
        #endregion
        #region 方法:判断两个值中的最大值
        /// <summary>
        /// 判断两个值中的最大值
        /// </summary>
        /// <param name="num1">第一个整数型的值</param>
        /// <param name="num2">第二个整数型的值</param>
        /// <returns>返回一个最大值</returns>
        public static int decNumber(int num1, int num2)
        {
            int max = num1 > num2 ? num1 : num2;
            return max;
        } 
        #endregion
        #region 方法:控制用户输入的字符只能为y/n
        /// <summary>
        /// 只允许输入y/n
        /// </summary>
        /// <param name="s1">判断是否是y/n</param>
        /// <returns>返回y/n</returns>
        public static string S1(string s1)
        {
            while (true)
            {
                s1 = Console.ReadLine();
                if (s1 == "y")
                {
                    Console.WriteLine("写了一天代码了,坐的屁股疼!");
                    return s1;
                }
                else if (s1 == "n")
                {
                    Console.WriteLine("造了一天的世界,坐的我屁股疼!");
                    return s1;
                }
                else
                {
                    Console.WriteLine("输入错误!");
                }
            }
        } 
        #endregion
        #region 方法:判断输入的是否为整数
        /// <summary>
        /// 判断输入的是否为整数
        /// </summary>
        /// <param name="n1">获取一个整数</param>
        /// <returns>返回一个整数</returns>
        public static int Number(int n1)
        {
            while (true)
            {
                try
                {
                    n1 = int.Parse(Console.ReadLine());
                    return n1;
                }
                catch (Exception)
                {
                    Console.WriteLine("请输入整数!");
                }
            }
        } 
        #endregion
    }
}
