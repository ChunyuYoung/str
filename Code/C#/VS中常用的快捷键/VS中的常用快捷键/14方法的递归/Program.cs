using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _14方法的递归
{
    class Program
    {
        static void Main(string[] args)
        {
            Str();
            Console.ReadKey();
        }
        public static int s1 = 0;
        /// <summary>
        /// 递归
        /// </summary>
        public static void Str()
        {
            Console.Write("S");
            Console.Write("T");
            Console.Write("R");
            Console.WriteLine();
            s1++;
            if (s1>=10)
            {
                return;
            }
            Str();
        }
    }
}
