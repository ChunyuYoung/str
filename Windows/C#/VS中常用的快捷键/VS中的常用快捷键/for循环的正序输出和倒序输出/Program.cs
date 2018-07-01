using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace for循环的正序输出和倒序输出
{
    class Program
    {
        static void Main(string[] args)
        {
            //请打印1-10
            for (int i = 1; i <= 10; i++)
            {
                Console.WriteLine(i);
            }
            for (int i = 10; 10 >= 0; i--)
            {
                Console.WriteLine(i);
            }
            //forr  再按tab键

            ////打印10-1
            //for (int i = 10; i >= 1; i--)
            //{
            //    Console.WriteLine(i);
            //}
            //Console.ReadKey();

        }
    }
}
