using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _12params可变参数
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] num = { 1, 2, 3, 4, 5, 6, 7 };
            //Console.WriteLine(Program.Num(num));
            Console.WriteLine(Program.Num(1,2,3,4,5,6,7,8,9));
            Console.ReadKey();
        }
        /// <summary>
        /// params可变参数
        /// </summary>
        /// <param name="s">声明一个可变参数数组</param>
        /// <returns>返回数组之和</returns>
        public static int Num(params int[] s)
        {
            int sum = 0;
            for (int i = 0; i < s.Length; i++)
            {
                sum += s[i];
            }
            return sum;
        }
    }
}
