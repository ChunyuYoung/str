using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _08类型转换_练习
{
    class Program
    {
        static void Main(string[] args)
        {
            #region 练习1:循环录入5个人的年龄并计算平均年龄
            ////练习1:循环录入5个人的年龄并计算平均年龄
            ////如果录入的数据出现负数或大于100的数,立即停止输入并报错
            //int age=-1;
            //int fushu=0;
            //int hunder=100;
            //Console.WriteLine("请输入你们5个人的年龄:");
            //for (int i = 0; i < 5 && ( age>fushu || age<hunder); i++)
            //{
            //    if (age > fushu || age < hunder)
            //    {
            //        age = int.Parse(Console.ReadLine());
            //    }
            //    else
            //    {
            //        Console.WriteLine("错误:程序获取数据出现负数或大于100的数!");
            //    }
            //}
            //Console.WriteLine("5个人的年龄平均值为{0}", age);
            //Console.ReadKey(); 

            ////老师写的
            //int sum = 0;
            //for (int i = 0; i < 5; i++)
            //{
            //    Console.WriteLine("请输入第{0}个人的成绩", i + 1);
            //    int age = Convert.ToInt32(Console.ReadLine());
            //    if (age>=0 && age <=100)
            //    {
            //        sum += age;
            //    }
            //    else
            //    {
            //        Console.WriteLine("输入的年龄不在正确范围内,程序退出!!!");
            //        break;
            //    }
            //}
            //Console.WriteLine("4个人的平均年龄是{0}", sum / 5);
            //Console.ReadKey();
            #endregion

            #region 练习2:在while循环中用break实现要求用户一直输入用户名和密码
            ////练习2:在while中用break实现要求用户一直输入用户名和密码,只要不是admin,
            ////88888就一直提示要求重新输入,如果正确则提示登录成功.
            //string name;
            //string pwd;
            //do
            //{
            //    Console.WriteLine("请输入用户名:");
            //    name = Console.ReadLine();
            //    Console.WriteLine("请输入密码:");
            //    pwd = Console.ReadLine();
            //} while (name != "admin" || pwd != "88888");
            //Console.WriteLine("登陆成功!");
            //Console.ReadKey();
            #endregion

            #region 练习3:1~100之间的整数相加,得到累加值大于20的当前数
            ////1~100之间的整数相加,得到累加值大于20的当前数6(比如:1+2+3+4+5+6=21)结果
            ////sum>=20 其实就是打印i的值
            //int sum=0;
            //for (int i = 0; i < 100; i++)
            //{
            //    if (i>20)
            //    {
            //        sum = i;
            //        Console.WriteLine(i);
            //    }
            //}
            //Console.ReadKey(); 

            //1~100之间的整数相加,得到累加值大于20的当前数6
            int sum = 0;
            for (int i = 1; i <= 100; i++)
            {
                sum += i;
                if (sum >= 20)
                {
                    Console.WriteLine("加到{0}的时候,总和大于了20", i);
                    break;
                }
            }
            Console.ReadKey();
            #endregion
        }
    }
}
