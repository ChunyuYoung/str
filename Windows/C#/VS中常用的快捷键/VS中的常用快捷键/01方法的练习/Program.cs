using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _01方法的练习
{
    class Program
    {
        static void Main(string[] args)
        {
            #region 第79题
            //79.用方法来实现:有一个字符串数组:
            //{"马龙","迈克尔乔丹","雷吉米勒","蒂姆邓肯","科比布雷恩特"},请输出罪长的
            //string[] names = { "马龙", "迈克尔乔丹", "雷吉米勒", "蒂姆邓肯", "科比布雷恩特" };
            //string max = Program.nameLength(names);
            //Console.WriteLine(max);
            //Console.ReadKey(); 
            #endregion
            //保留小数会自动四舍五入
            #region 第80题
            ////80.用方法来实现:请计算出一个 整形数组的平均值.保留两位小数
            //int[] numbers = { 1, 2, 7 };
            //double avg = Program.GetAvg(numbers);
            ////Console.WriteLine(avg);
            //string f = avg.ToString("0.00");
            //avg = Convert.ToDouble(f);
            //Console.WriteLine(avg);
            //Console.ReadKey(); 
            #endregion
            #region 第81题
            //写一个方法,用来判断用户输入的数字是不是质数
            //在写一个方法,要求用户只能输入数组 输入有误就一直让用户输入
            Console.WriteLine("输入一个整数,我们将判断是否是质数");
            string strNumber = Console.ReadLine();
            int number = Program.Number(strNumber);
            bool b = Program.IsPrime(number);
            Console.WriteLine(b);
            Console.ReadKey(); 
            #endregion
        }
        /// <summary>
        /// 判断是否是质数
        /// </summary>
        /// <param name="number">要被判断的整数</param>
        /// <returns>返回一个布尔类型</returns>
        public static bool IsPrime(int number)
        {
            while (true)
            {
                if (number < 2)     //是质数
                {
                    return true;
                }
                else                //不是质数
                {
                    for (int i = 2; i < number; i++)
                    {
                        if (number % 2 == 0)
                        {
                            return false;
                        }
                    }   
                }
                return true;
            }
        }
        /// <summary>
        /// 纠正用户输入的字符为整数
        /// </summary>
        /// <param name="strNumber">获取输入额字符</param>
        /// <returns>返回一个整数</returns>
        public static int  Number(string strNumber)
        {
            while (true)
            {
                try
                {
                    int number = Convert.ToInt32(strNumber);
                    return number;
                }
                catch
                {
                    Console.WriteLine("错误:请输入一个整数");
                    strNumber = Console.ReadLine();
                }
            }
        }
        /// <summary>
        /// 求数组的平均值
        /// </summary>
        /// <param name="Avg">形参</param>
        /// <returns>返回一个平均值</returns>
        public static double GetAvg(int[] Avg)
        {
            double avg = 0;
            for (int i = 0; i < Avg.Length; i++)
            {
                avg += Avg[i];
            }
            return avg / Avg.Length;
        }
        /// <summary>
        /// 求一个数组的长度
        /// </summary>
        /// <param name="s">形参</param>
        /// <returns>返回最长的数组元素</returns>
        public static string nameLength(string[] s)
        {
            string max = s[0];
            for (int i = 0; i < s.Length; i++)
            {
                if (s[i].Length > max.Length)
                {
                    max = s[i];
                }
            }
            return max;
        }
    }
}
