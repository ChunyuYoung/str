using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace 循环结构
{
    class Program
    {
        static void Main(string[] args)
        {
            //想控制台打印100遍 下次考试我一定要细心
            //循环体:Console.WriteLine("下次考试我一定要细心");
            //循环条件:打印的次数小于100遍
            //需要定义一个循环变量,用来记录循环的次数,每次循环都应该自身加1
            int i = 0;
            while (i < 100)
            {
                Console.WriteLine("下次考试我一定要细心\t{0}",i);
                i++;    //每循环一次都加1

            }
            Console.ReadKey();
        }
    }
}
