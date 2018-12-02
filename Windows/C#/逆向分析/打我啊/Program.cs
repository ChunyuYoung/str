using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace 打我啊
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = 1000;
            int bak = 1000;         //n的校验值
            for (int i = 0; i < n; i++)
            {
                Console.WriteLine("请按下\"x\"打我");
                string s = Console.ReadLine();
                n--;
                bak--;
                if (n != bak)       //判断n是否被非法修改
                    Console.WriteLine("程序被破解");
                Console.WriteLine(n);
            }
        }
    }
}
