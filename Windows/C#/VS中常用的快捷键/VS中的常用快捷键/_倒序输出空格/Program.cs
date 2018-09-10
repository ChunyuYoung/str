using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _倒序输出空格
{
    class Program
    {
        static void Main(string[] args)
        {
            char ch = '*';
            for (int i = 3; i > 0; i--)
            {
                Console.Write(ch);
                Console.WriteLine();
            }
            Console.ReadKey();
        }
    }
}
