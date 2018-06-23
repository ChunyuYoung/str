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
            //if (i>=10)
            //{
            //    Console.WriteLine("老师:都给你讲了10遍了!还不会,快去回家养猪吧,孩纸!");
            //}
            //Console.ReadKey();
            #endregion

            //2006年培养学员80000人
            //每年增长25%
            //请按照此增长速度
            //到哪一年培训学员人数将达到20万人?

            //年份-->year-->2006年
            int year = 2006;
            //第一年 总人数 80000人
            double FirstYear = 8;
            //每年人口增长率 25%-->0.25
            double AnnualGrowth = 0.25;
            //8*(5/4)ⁿ=20

            while (true)
            {
                //YearPeople = (FirstYear * AnnualGrowth) + FirstYear;
                year++;
                FirstYear *=(AnnualGrowth + 1);
                if (FirstYear > 20)
                    break;
            }
            Console.WriteLine("{0}年人口达到了20万人", year);
            Console.ReadKey();
        }
    }
}
