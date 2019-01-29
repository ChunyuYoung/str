using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _01复习
{
    class Program
    {
        static void Main(string[] args)
        {
            Person p = new Person("大硬盘",101,'中');
            p.sayHello();
            Person pp = new Person("翠花", 19,'0');
            p.twoName();

            //医院病人信息分类
            //就诊病人信息
            Health h1 = new Health("史钿睿", 20, '中', "这是什么");     //调用完整构造函数
            h1.strh1();
            Health h2 = new Health("菊花", 19, '女', "重病");
            h2.strh1();
            //预约病人
            Health h3 = new Health("史珍香", 16, '屎');                 //调用重载构造函数
            h3.strh1();
            Health h4 = new Health("交后跟", 17, '女');
            h4.strh1();

            Console.ReadKey();
        }
    }
}
