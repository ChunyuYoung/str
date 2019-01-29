using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace 判断月份天数_和判断闰年的方法一致_
{
    class Program
    {
        static void Main(string[] args)
        {
            //请用户输入年份,再输入月份,输出该月的天数.(结合之前如何判断闰年来做)
            //try_cach

            #region 自制判断闰年和显示月份的总天数
            ////bool t_or_f = true;     //仅仅在异常处理时提示一次错误而不是两次,所以目前需要去除switch下的错误提示,而是直接执行异常处理的报错提示
            //int year = 0, month = 0;

            //Console.WriteLine("请输入与年份:");
            //try
            //{
            //    year = Convert.ToInt32(Console.ReadLine());
            //}
            //catch (Exception)
            //{
            //    Console.WriteLine("错误,输入的年份不能被识别为整数型!");
            //}
            //Console.WriteLine("请输入与月份:");
            //try
            //{
            //     month = Convert.ToInt32(Console.ReadLine());
            //}
            //catch
            //{
            //    Console.WriteLine("错误,输入的月份不能被识别为整数型!");
            //}

            ////int day;
            ////年份不能够被400整除.(2000)
            ////年份能够被4整除但不能被100整除.(2008)
            //bool b = (year % 400 == 0) || (year % 4 ==0 && year % 100 != 0);

            ////b为真,表示这一年为闰年
            //if (b == true && year != 0 && month != 0)
            //{
            //    switch (month)
            //    {
            //        //case中的代码相同可以省略
            //        //例如:
            //        //case 12:
            //        //case 10:
            //        //case 8:
            //        //case 7:
            //        //case 5:
            //        //case 3:
            //        //case 1:Console.WriteLine("这个月是31天");
            //        //break;
            //        case 12:
            //            Console.WriteLine("这个月是31天");
            //            break;
            //        case 11:
            //            Console.WriteLine("这个月是30天");
            //            break;
            //        case 10:
            //            Console.WriteLine("这个月是31天");
            //            break;
            //        case 9:
            //            Console.WriteLine("这个月是30天");
            //            break;
            //        case 8:
            //            Console.WriteLine("这个月是31天");
            //            break;
            //        case 7:
            //            Console.WriteLine("这个月是30天");
            //            break;
            //        case 6:
            //            Console.WriteLine("这个月是30天");
            //            break;
            //        case 5:
            //            Console.WriteLine("这个月是31天");
            //            break;
            //        case 4:
            //            Console.WriteLine("这个月是30天");
            //            break;
            //        case 3:
            //            Console.WriteLine("这个月是31天");
            //            break;
            //        case 2:
            //            Console.WriteLine("这个月是29天");
            //            break;
            //        case 1:
            //            Console.WriteLine("这个月是31天");
            //            break;
            //        default:
            //           //t_or_f = false;
            //            Console.WriteLine("错误,无法识别的月份");
            //            break;
            //    }
            //}
            //else if (b != true)
            //{
            //    switch (month)
            //    {
            //        case 12:
            //            Console.WriteLine("这个月是31天");
            //            break;
            //        case 11:
            //            Console.WriteLine("这个月是30天");
            //            break;
            //        case 10:
            //            Console.WriteLine("这个月是31天");
            //            break;
            //        case 9:
            //            Console.WriteLine("这个月是30天");
            //            break;
            //        case 8:
            //            Console.WriteLine("这个月是31天");
            //            break;
            //        case 7:
            //            Console.WriteLine("这个月是30天");
            //            break;
            //        case 6:
            //            Console.WriteLine("这个月是30天");
            //            break;
            //        case 5:
            //            Console.WriteLine("这个月是31天");
            //            break;
            //        case 4:
            //            Console.WriteLine("这个月是30天");
            //            break;
            //        case 3:
            //            Console.WriteLine("这个月是31天");
            //            break;
            //        case 2:
            //            Console.WriteLine("这个月是28天");
            //            break;
            //        case 1:
            //            Console.WriteLine("这个月是31天");
            //            break;
            //        default:
            //            //t_or_f = false;
            //            Console.WriteLine("错误,无法识别的月份");
            //            break;
            //    }
            //}
            ////if (t_or_f)
            ////{
            ////    Console.WriteLine("错误:出现\"数据类型匹配错误\"");
            ////}
            //Console.ReadKey(); 
            #endregion

            Console.WriteLine("请输入一个年份");
            //这里做了异常处理,可以防止输入其他除了整数类型的数据
            try
            {
                int year = Convert.ToInt32(Console.ReadLine());
                Console.WriteLine("请输入一个月份");
                //这里做了异常处理,可以防止输入其他除了整数类型的数据
                try
                {
                    int month = Convert.ToInt32(Console.ReadLine());    //1-12
                    int day = 0;    //声明一个变量用来存储天数
                    
                    //控制输入的月份在1-12月内
                    if (month > 1 && month <= 12)
                    {
                        switch (month)
                        {
                            //因为case 1 3 5 7 8 10 12的代码是相同的所以可以省略成这样写
                            case 1:
                            case 3:
                            case 5:
                            case 7:
                            case 8:
                            case 10:
                            case 12:
                                day = 31;
                                break;
                            case 2:
                                //由于2月 有平年和闰年的不同 所以首先要判断一下今年是不是闰年
                                //这里把二月份拉出来打断判断
                                if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))
                                {
                                    day = 29;
                                }
                                else
                                {
                                    day = 28;
                                }
                                break;
                            // 4 6 9 11 
                            //当1 3 5 7 8 10 12位31天的时,剩下的月份自然也就是30天,然而又除去单独判断的2月份
                            default:
                                day = 30;
                                break;
                        }
                        Console.WriteLine("{0}年{1}月{2}天", year, month, day);
                    }//if的括号
                    else
                    {
                        Console.WriteLine("输入的月份不符合要求,程序退出");
                    }
                }//try月份的括号
                catch
                {
                    Console.WriteLine("输入的月份有误,程序退出");
                }
            }//try年份的括号
            catch   //跟年份的try配对
            {
                Console.WriteLine("输入的年份有误,程序退出");
            }
            Console.ReadKey();
        }
    }
}
