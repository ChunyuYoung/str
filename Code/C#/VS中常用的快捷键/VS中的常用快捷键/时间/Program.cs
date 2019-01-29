using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace 时间
{
    class Program
    {
        /// <summary>
        ///     1.编程实现计算几天(比如46天)是几周零几天
        ///     2.编程实现107653秒是几天几小时几分钟几秒?
        ///     3.修改上面的题目,让用户输入小时(Hour),分钟(Minute),秒(Second0)
        /// </summary>
        /// <param name="args"></param>
        static void Main(string[] args)
        {
            ////练习1
            //int week;
            //int day;
            //int time = 46;
            //week = 46 / 7;
            //day =46-( week * 7);
            //Console.WriteLine("46天是{0}周{1}天", week, day);
            //Console.ReadKey();

            //练习2
            int day = (60 * 60) * 24;
            int hour = 60 * 60;
            int minute = 60;
            //int second = 0;
            int total_time = 101653;

            //字符型数据转换数值型
            //string day_s;
            //string hour_s;
            //string minute_s;
            //string second_s;

            //存储计算变量
            int day_n1;
            int hour_n2;
            int minute_n3;
            int second_n4;

            //只用来存储并读取的值
            int day_n1_n1;
            int hour_n1_n2;
            int minute_n1_n3;
            //int second_n1_n4;

            //计算天数
            day_n1 = total_time / day;
            day_n1_n1 = day_n1;
            day_n1 = day_n1 * day;
            total_time= total_time - day_n1;

            //计算小时
            hour_n2 = total_time / hour;
            hour_n1_n2 = hour_n2;
            hour_n2 = hour_n2 * hour;
            total_time = total_time - hour_n2;

            //计算分钟
            minute_n3 = total_time / minute;
            minute_n1_n3 = minute_n3;
            minute_n3 = minute_n3 * minute;
            total_time = total_time - minute_n3;

            //计算秒数
            second_n4 = total_time;

            Console.WriteLine("总时间:101653 为 {0}天{1}时{2}分{3}秒",day_n1_n1,hour_n1_n2,minute_n1_n3,second_n4);
            Console.ReadKey();

            //Console.Read()获取的是否是整数
            //Console.WriteLine("输入一个值!");
            //int a= Console.Read();
            //Console.WriteLine("a={0}", a);
            //Console.ReadKey();

        }
    }
}
