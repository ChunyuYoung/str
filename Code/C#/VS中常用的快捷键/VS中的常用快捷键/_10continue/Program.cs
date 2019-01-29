using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _10continue
{
    class Program
    {
        static void Main(string[] args)
        {
            #region 计算1-100之内除了能被7整除数之外的和
            ////练习1:用 while continue实现计算1到100(含)之间的除了能被7整除值外所有整数的和
            //int num = 0;
            //int i = 1;
            //while (i <= 100)
            //{
            //    if (i % 7 == 0)
            //    {
            //        i++;
            //        continue;
            //    }
            //    //num = i % 7;
            //    num += i;
            //    i++;
            //}
            //Console.WriteLine("1-100之间除了7所有整数的和为:{0}", num);
            //Console.ReadKey(); 
            #endregion

            #region 输出100内所有整数的素数
            //练习2:找出100内所有整数的素数
            //质数/素数:只能被1和这个数字本身整除的数字
            for (int i = 1; i <= 100; i++)
            {
                if ((i % 1 == 0) && (i % i == 0))
                {
                    if(i!=1)
                        Console.WriteLine("质数/素数:{0}", i);
                    i++;
                }
            }
            Console.WriteLine("\n程序结束!");
            Console.ReadKey(); 
            #endregion
        }
    }
}
