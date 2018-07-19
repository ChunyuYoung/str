using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace 方法练习
{
    class Program
    {
        static void Main(string[] args)
        {
            int dec;    //十进制整数
            Console.WriteLine("请输入一个十进制整数:");
            dec = int.Parse(Console.ReadLine());
            for (int i = 0; dec != 0; i++)
            {
                dec = dec % 2;
                Console.Write(dec);
            }
            Console.ReadKey();
        }
    }
}
