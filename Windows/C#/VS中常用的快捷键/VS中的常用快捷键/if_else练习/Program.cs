using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace if_else练习
{
    class Program
    {
        /// <summary>
        /// 判断学生成绩的等级
        /// </summary>
        /// <param name="args"></param>
        static void Main(string[] args)
        {
            //对学生的结业考试成绩评测
            //成绩>=90 A
            //90>成绩>=80 B
            //80>成绩>=70 C
            //70>成绩>=60 D
            //成绩<60 E
            #region 会出问题的if条件判断
            //Console.WriteLine("请输入你的成绩:");
            //int score = Convert.ToInt32(Console.ReadLine());
            //if (score >= 90)
            //{
            //    Console.WriteLine("你的成绩是:A");
            //}

            //if (score < 90 && score >= 80)
            //{
            //    Console.WriteLine("你的成绩是:B");
            //}

            //if (score < 80 && score >= 70)
            //{
            //    Console.WriteLine("你的成绩是:C");
            //}

            //if (score < 70 && score >= 60)
            //{
            //    Console.WriteLine("你的成绩是:D");
            //}
            //if(score<60)
            //{
            //    Console.WriteLine("你的成绩是E");        //else会跟离他最近的if配对,当if不成立时就一定会执行这个else,所以就会造成输出两个值得原因
            //}

            //Console.ReadKey();
            #endregion
            #region 以上问题已经解决,但是代码依然不够简洁
            //Console.WriteLine("请输入你的成绩");
            //int score = Convert.ToInt32(Console.ReadLine());
            //if (score >= 90)
            //{
            //    Console.WriteLine("A");
            //}
            //else
            //{
            //    if (score >= 80)
            //    {
            //        Console.WriteLine("B");
            //    }
            //    else
            //    {
            //        if (score >= 70)
            //        {
            //            Console.WriteLine("C");
            //        }
            //        else
            //        {
            //            if (score >= 60)
            //            {
            //                Console.WriteLine("D");
            //            }
            //            else
            //            {
            //                Console.WriteLine("E");
            //            }
            //        }
            //    }
            //}
            //Console.ReadKey();
            #endregion
            //最好的做法
            Console.WriteLine("请输入你的成绩:");
            int score = Convert.ToInt32(Console.ReadLine());
            if (score >= 90)
            {
                Console.WriteLine("A");
            }
            else if (score >= 80)
            {
                Console.WriteLine("B");
            }
            else if (score >= 70)
            {
                Console.WriteLine("C");
            }
            else if (score >= 60)
            {
                Console.WriteLine("D");
            }
            else
            {
                Console.WriteLine("E");
            }
            Console.ReadKey();
        }
    }
}
