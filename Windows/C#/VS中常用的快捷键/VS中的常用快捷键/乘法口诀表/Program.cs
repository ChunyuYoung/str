using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace 乘法口诀表
{
    class Program
    {
        static void Main(string[] args)
        {
            #region 九九乘法表
            //for (int i = 1; i <= 9; i++)
            //{
            //    for (int j = 1; j <= 9; j++)
            //    {
            //        Console.Write("{0}*{1}={2}\t", i, j, i * j);    //可以加入\n转义字符换行
            //    }
            //    Console.WriteLine();        //什么都不写表示换行
            //}
            //Console.ReadKey();
            #endregion
            for (int i = 1; i <= 9; i++)
            {
                for (int j = 1; j <= i; j++)
                {
                    Console.Write("{0}*{1}={2}\t", i, j, i * j);
                }
                Console.WriteLine();
            }
            Console.ReadKey();
        }
    }
}
