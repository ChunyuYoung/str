using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _for循环练习
{
    class Program
    {
        static void Main(string[] args)
        {
            #region 求1-100整数和 偶数和 奇数和
            //求1-100之间的所有整数和 偶数和 奇数和
            //求整数和
            //int sum = 0;
            //for (int i = 1; i <= 100; i++)
            //{
            //    if (i % 2 == 0)
            //    {
            //        sum += i;
            //    }
            //}
            //Console.WriteLine(sum);
            //Console.ReadKey();

            ////求1-100之间的所有整数和 偶数和 奇数和
            ////求偶数和
            //int sum = 0;
            //for (int i = 2; i <=100; i+=2)  //如果是求奇数的话那么int i=1;i+=2;
            //{
            //    sum += i;
            //}
            //Console.WriteLine(sum);
            //Console.ReadKey(); 
            #endregion

            //找出100-999键的水仙花数
            //水仙花数指的就是 这个百位数字的
            //百位的立方+ 十位的立方 = 个位的立方 == 当前这个百位的数字
            //153 1 125 27
            //百位:153/100
            //十位:153%100/10
            //个位:153%10

            #region 水仙花数_个人算法
            //int One = 0;
            //int Ten = 0;
            //int Hunder = 0;
            //int sum;
            //int sum1;
            //sum = Convert.ToInt32(Console.ReadLine());
            //Hunder = sum / 100;
            //Ten = sum % 100 / 10;
            //One = sum % 10;
            //sum1 = Hunder * Hunder * Hunder + Ten * Ten * Ten + One * One * One;
            //if (sum == sum1)
            //{
            //    Console.WriteLine("{0}是水仙花数", sum);
            //}
            //else
            //    Console.WriteLine("看来这个数不是水仙花数");
            //Console.ReadKey(); 
            #endregion

            for (int i = 100; i <= 999; i++)
            {
                int Hunder = i / 100;
                int Ten = i % 100 / 10;
                int One = i % 10;
                if (Hunder * Hunder * Hunder + Ten * Ten * Ten + One * One * One ==i)
                {
                    Console.WriteLine("{0}水仙花数!", i);
                }
            }
            Console.ReadKey();
        }
    }
}
