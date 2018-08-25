using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _04面向对象练习
{
    class Program
    {
        static void Main(string[] args)
        {
            Student p = new Student("小兰",23,'女',98,97,100);
            p.xiaoLan();
            p.xlScore();
            Student pp = new Student("李华", 0, '0', 100, 100, 100);  //函数重载,构造函数调用全参构造函数
            pp.liHua();
            Console.ReadKey();
        }
    }
}
