using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _15方法练习
{
    class Program
    {
        static void Main(string[] args)
        {
            #region 练习题
            //提示用户输入两个数字,计算两个数字之间的所有整数的和
            //1. 用户只能输入数字
            //2. 计算两个数字之间的和
            //3. 要求第一个数字必须必第二个数字小 就重新输入 
            #endregion
            Console.WriteLine("请输入第一个加数");
            string strNumOne = Console.ReadLine();
            int NumberOne = Program.sumNumberOne(strNumOne);
            Console.WriteLine("请输入第二个加数");
            string strNumTwo = Console.ReadLine();
            int NumberTwo = Program.sumNumberOne(strNumTwo);
            Program.strMaxNumber(NumberOne,NumberTwo);
            Console.WriteLine(Program.strNumSum(NumberOne, NumberTwo));
            Console.ReadKey();
        }
        /// <summary>
        /// 要求第一个数字必须比第二个数字小
        /// </summary>
        /// <param name="n1">必须小</param>
        /// <param name="n2">必须大</param>
        /// <returns>返回一个最小值和最大值</returns>
        public static int strMaxNumber(int n1, int n2)
        {
            while (true)
            {
                if (n1 < n2)
                {
                    return n1;
                }
                else
                {
                    Console.WriteLine("错误:第一个数必须比第二个数小");
                    try
                    {
                        Console.WriteLine("请输入第一个数");
                        n1 = Convert.ToInt32(Console.ReadLine());
                        Console.WriteLine("请输入第二个数");
                        n2 = Convert.ToInt32(Console.ReadLine());
                    }
                    catch
                    {
                        Console.WriteLine("请输入整数!");
                    }
                }
            }
        }
        /// <summary>
        /// 计算两个数字之间的和
        /// </summary>
        /// <param name="n1">第一个起始值</param>
        /// <param name="n2">第二个最终值</param>
        /// <returns>返回一个和</returns>
        public static int strNumSum(int n1,int n2)
        {
            int sum = 0;
            for (int i = n1; i <= n2; i++)
            {
                sum += i;
            }
            return sum;
        }
        /// <summary>
        /// 只能输入整数
        /// </summary>
        /// <param name="n1">转换为整数</param>
        /// <returns>返回一个整数</returns>
        public static int sumNumberOne(string n1)
        {
            while (true)
            {
                try
                {
                    int sum = Convert.ToInt32(n1);
                    return sum;
                }
                catch
                {
                    Console.WriteLine("请输入整数");
                    n1 = Console.ReadLine();
                }
            }
        }
    }
}
