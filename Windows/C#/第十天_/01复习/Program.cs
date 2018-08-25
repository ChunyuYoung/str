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
            Console.ReadKey();
        }
    }
}
