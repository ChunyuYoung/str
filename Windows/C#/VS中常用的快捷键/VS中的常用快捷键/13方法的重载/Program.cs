using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _13方法的重载
{
    class Program
    {
        static void Main(string[] args)
        {
            int sum1 = 10;
            int sum2 = 10;
            //STR方法的重载
            Console.WriteLine( Program.STR(sum1,sum2));
            Console.ReadKey();
        }
        /// <summary>
        /// 计算两个整数的和
        /// </summary>
        /// <param name="n1">加数</param>
        /// <param name="n2">加数</param>
        /// <returns>返回两个加数之和</returns>
        public static int STR( int n1, int n2)
        {
            return n1 + n2;
        }
        /// <summary>
        /// 组合两个字符串
        /// </summary>
        /// <param name="s1">第一段字符串</param>
        /// <param name="s2">第二段字符串</param>
        /// <returns>返回一段字符串</returns>
        public static string STR(string s1, string s2)
        {
            return s1 + s2;
        }
        /// <summary>
        /// 一个字符
        /// </summary>
        /// <param name="c1">字符</param>
        /// <returns>返回一个字符</returns>
        public static char STR(char c1)
        {
            return  c1;
        }
        /// <summary>
        /// 计算两个双精度变量之和
        /// </summary>
        /// <param name="d1">加数1</param>
        /// <param name="d2">加数2</param>
        /// <returns>返回和</returns>
        public static double STR(double d1, double d2)
        {
            return d1 + d2;
        }
    }
}
