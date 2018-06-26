using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace 循环结构_练习
{
    class Program
    {
        static void Main(string[] args)
        {
            //切记异常处理代码最后在写
            #region 根据班级人数计算总人数的总成绩和平均成绩
            ////输入班级人数
            ////然后依次输入学员成绩,计算班级学院的平均成绩和总成绩

            ////声明班级 总人数 为 整数型
            //int class_people;
            ////声明班级 学员 的成绩为整数型
            //int people = 0;
            //int people1 = 0;
            //int advage = 0;
            ////声明一个 记次循环 变量
            //int i = 0;

            ////获取总学员的人数
            //Console.WriteLine("请输入学员的总人数:");
            //class_people = Convert.ToInt32(Console.ReadLine());

            //while (i < class_people)
            //{
            //    Console.WriteLine("总共有\"{0}\"个学员", class_people);
            //    Console.WriteLine("请输入\"学员的总成绩(每个)\"");
            //    //获取每个 学员 的总成绩
            //    people = Convert.ToInt32(Console.ReadLine());
            //    //将每次的学员总成绩相加
            //    //不能这样写people+=people;这样写运行会出逻辑问题
            //    people1 += people;
            //    //每次循环自身加1
            //    i++;
            //}
            ////想控制台打印学员的总成绩和班级总学员的平均成绩
            //Console.WriteLine("学员的总成绩为:{0},平均成绩为:{1}", people1, advage = people1 / class_people);
            //Console.ReadKey();
            #endregion

            #region 给学生讲作业,如果不懂的话最多讲10遍,才能放他回家吃饭
            ////老师问学生,这道题你会做了吗?
            ////如果学生回答"会了(y)"则可以放学

            ////如果学生不会做(n)
            ////则老师在讲一遍,再问学生是否会做...
            ////直到学生会为止,才可以放学
            ////直到学生会或老师给他讲了10遍还不会,都要放学
            //Console.WriteLine("老师:这道题你会做吗?[yes/no]");
            //string strWord = Console.ReadLine();
            //int i = 0;

            //if (strWord == "yes")
            //{
            //    Console.WriteLine("放学");
            //}
            //else
            //{
            //    //当一个判断条件为真的时候就跳出循环
            //    while (i < 10 || strWord == "yes")
            //    {
            //        Console.WriteLine("老师:这道题你会做吗[yes/no]?");
            //        strWord = Console.ReadLine();
            //        if (strWord == "yes")
            //        {
            //            Console.WriteLine("放学");
            //            //当条件为真时跳出循环
            //            break;
            //        }
            //        i++;
            //    }
            //}
            ////当不会大于等于10次以上就要提示放学
            //if (i >= 10)
            //{
            //    Console.WriteLine("老师:都给你讲了10遍了!还不会,快去回家养猪吧,孩纸!");
            //}
            //Console.ReadKey();
            #endregion

            #region 每年增长率25%,什么时候能达到20万人
            ////2006年培养学员80000人
            ////每年增长25%
            ////请按照此增长速度
            ////到哪一年培训学员人数将达到20万人?

            ////年份-->year-->2006年
            //int year = 2006;
            ////第一年 总人数 80000人
            //double FirstYear = 8;
            ////每年人口增长率 25%-->0.25
            //double AnnualGrowth = 0.25;
            ////8*(5/4)ⁿ=20

            //while (true)
            //{
            //    //YearPeople = (FirstYear * AnnualGrowth) + FirstYear;
            //    year++;
            //    FirstYear *= (AnnualGrowth + 1);
            //    if (FirstYear > 20)
            //        break;
            //}
            //Console.WriteLine("{0}年人口达到了20万人", year);
            //Console.ReadKey();
            #endregion

            #region 只能输入yes或者y
            ////提示用户输入yes或者y
            ////要求:只能输入yes或者no,只要不是yes或者no就要求用户一直重新输入

            ////循环体:提示用户输入 我们接受并且判断
            ////循环条件:输入的不能是yes或者no

            //string input = "";
            //while (input != "yes" && input != "no")
            //{
            //    Console.WriteLine("请输入yes或者no");
            //    input = Console.ReadLine();
            //}
            //Console.ReadKey(); 
            #endregion

            #region 限制用户输入用户米和密码的次数(3次)
            ////提示用户输入用户名和密码 要求用户名等于admin密码等于888888
            ////只要用户名错误或者密码错误就重新输入
            ////但是,最多只能输入3次

            ////循环体:提示用户输入用户名密码 接收 判断
            ////循环条件:用户户名或者面错误 最多错误3次

            //int i = 0;
            //string userName = "";
            //string userPass = "";
            //while ((userName != "admin" || userPass != "888888") && i <= 3)
            //{
            //    Console.WriteLine("请输入用户名:");
            //    userName = Console.ReadLine();
            //    Console.WriteLine("请输入密码:");
            //    userPass = Console.ReadLine();
            //    i++;
            //}
            //Console.ReadKey(); 
            #endregion

            #region 判断用户输入的用户名和面是否为空
            ////写两个血环
            ////第一二循环提示用户A输入用户名 要求A的用户名不能为空,只要为空,就要求A一直重新输入

            ////循环体:提示A输入用户名 接收 判断
            ////循环条件:输入的用户名为空

            //string userNameA = "";
            //while (userNameA == "")
            //{
            //    Console.WriteLine("请输入用户名,不能为空");
            //    userNameA = Console.ReadLine();
            //}
            ////Console.ReadKey();

            ////第二个循环提示用户B输入用户名,要求B的用户名不能跟A的用户名相同 并且不能为空
            ////只要为空,并且跟A的用户名相同,就一直提示用户B重新输入用户名

            ////缓缓体:提示输入B的用户名 接收判断
            ////循环条件:用户名为空 或者跟A的相同

            //Console.WriteLine("请输入用户性,不能跟A相同,并且不能为空");
            //string userNameB = Console.ReadLine();
            //while (userNameB == "" || userNameB == userNameA)
            //{
            //    if (userNameB == "")
            //    {
            //        Console.WriteLine("用户名不能为空,请重新输入");
            //        userNameB = Console.ReadLine();
            //    }
            //    else
            //    {
            //        Console.WriteLine("用户名B不能跟A的用户名相同,请重新输入");
            //        userNameB = Console.ReadLine();
            //    }
            //}
            //Console.ReadKey(); 
            #endregion

        }
    }
}
