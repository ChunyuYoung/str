using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace 接收用户的输入
{
    class Program
    {
        static void Main(string[] args)
        {
            string name;
            string age;
            string gender;
            Console.WriteLine("请输入您的姓名(回车进行下一步)");
            name = Console.ReadLine();
            Console.WriteLine("请输入您的性别(按回车进行下一步)");
            gender = Console.ReadLine();
            Console.WriteLine("请输入您的年龄(回车进行下一步)");
            age = Console.ReadLine();
            Console.WriteLine("您的姓名是:{0},您的性别是:{1},您的年龄是:{2}岁", name,gender, age);
            Console.ReadKey();

        }
    }
}
