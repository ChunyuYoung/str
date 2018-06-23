using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace break关键字的用法
{
    class Program
    {
        static void Main(string[] args)
        {
            //int i = 0;
            //while (i <= 100)
            //{
            //    Console.WriteLine("Hello World!");
            //    i++;
            //    break;
            //}
            //Console.ReadKey();

            //要求用户输入用户名和密码 用户名只要不是admin 密码只要不是888888
            //循环体;提示用户输入用户名 我们接收 密码 接收 判断是否登录成功
            //循环条件:用户名或密码错误
            string userName = "";
            string userPwd = "";
            while (userName != "admin" || userPwd != "888888")
            {
                Console.WriteLine("请输入用户名:");
                userName = Console.ReadLine();
                Console.WriteLine("请输入密码:");
                userPwd = Console.ReadLine();
            }
            Console.WriteLine("登陆成功!");
            Console.ReadLine();

        }
    }
}
