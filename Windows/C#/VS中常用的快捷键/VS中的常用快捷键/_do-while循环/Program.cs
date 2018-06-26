using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _do_while循环
{
    class Program
    {
        static void Main(string[] args)
        {
            #region 使用do-while循环练习
            //明天小兰就要登台演出了,老师说再把明天的演出的歌曲在唱一遍
            //如果满意,小兰就可以回家了.否咋恩就需要在练习一遍,知道老师满意为止.(y/n)

            ////循环体:小兰唱了一遍 问老师 满意么? 老师回答
            ////循环条件:老师不满意
            //Console.WriteLine("老师我唱的你满意么?");
            //string answer = Console.ReadLine();
            //while (answer == "no")
            //{
            //    Console.WriteLine("老师,我在问一遍,你满意么");
            //    answer = Console.ReadLine();
            //}
            ////遇见这种首先执行一遍的循环体,拿着执行后的结果在去判断是否执行的循环.
            ////我们首先推荐使用do-while循环.
            //Console.ReadLine();

            //string answer = "";
            //do
            //{
            //    Console.WriteLine("老师,我唱的你满意吗?");
            //    answer = Console.ReadLine();
            //} while (answer == "no");
            //Console.WriteLine("OK,放学回家~~~");
            //Console.ReadKey(); 
            #endregion

            #region 不断的要求用户输入学生姓名
            ////练习3:不断要求用户输入学生姓名,输入q结束.
            //string name;
            //do
            //{
            //    Console.WriteLine("请输入你的姓名:(输入q则退出)");
            //    name = Console.ReadLine();
            //} while (name != "q");
            //Console.WriteLine("成功!");
            //Console.ReadLine(); 
            #endregion

            #region 判断用户输入的是否是字符(如果为真则退出)
            ////练习4:不断要求用户输入一个数字,然后打印这个数字的二倍,当用户输入q的时候退出.
            //string input = "";
            //int number;
            //while (input != "q")
            //{
            //    Console.WriteLine("输入一个整数型数字(输入q退出)");
            //    input = Console.ReadLine();
            //    if (input != "q")
            //    {
            //        try
            //        {
            //            number = Convert.ToInt32(input);
            //            Console.WriteLine("你输入的数字是:{0},这个数字的二倍是:{1}", input, number *= 2);
            //        }
            //        catch
            //        {
            //            Console.WriteLine("错误:输入的字符不能被转换成数字!");
            //            Console.WriteLine("请重新输入:");
            //        }
            //    }
            //    else
            //    {
            //        Console.WriteLine("程序退出!");
            //    }
            //}
            //Console.ReadKey(); 
            #endregion

            //练习5:不断要求用户输入一个数字(假定用户输入的都是正整数),当用户输入end的时候显示刚才输入的数字中的最大值
            //循环体:提示用户输入一个数字 接收 转换成int类型 不停地比较大小
            //循环条件:输入的不能是end

            string input = "";
            int max = 0;
            while (input != "end")
            {
                Console.WriteLine("请输入一个数字,输入end我们将显示你输入的最大值");
                input = Console.ReadLine();   // 数字 end 其他字符
                if (input != "end")
                {
                    try
                    {
                        int number = Convert.ToInt32(input);
                        //让用户输入的每个数字都跟我的最大值比较,只要比我假定的最大值要大
                        //就把当前输入的这个数字赋值给我的最大值
                        if (number > max)
                        {
                            max = number;
                        }
                    }
                    catch
                    {
                        Console.WriteLine("错误:输入的数据无法被转换成数字类型");
                    }
                }
                else
                {
                    Console.WriteLine("您刚才输入的数字中最大值是{0}", max);
                }
            }
            Console.ReadKey();
        }
    }
}
