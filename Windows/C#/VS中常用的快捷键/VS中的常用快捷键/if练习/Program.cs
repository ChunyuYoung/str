using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace if练习
{
    class Program
    {
        /// <summary>
        /// 判断用户的年龄是否到了该结婚的年龄
        /// 判断老苏的成绩是否应该奖励100元
        /// 判断用户输入的用户名和密码是否是正确的
        /// </summary>
        /// <param name="args"></param>
        static void Main(string[] args)
        {
            //让用户输入年龄,如果输入的年龄大于23(且等于)岁,则给用户显示你到了结婚的年龄了.
            Console.WriteLine("请输入你的年龄");
            int old = Convert.ToInt32(Console.ReadLine());
            if (old >= 23)
            {
                Console.WriteLine("你到了结婚的年龄");
            }
            else
                Console.WriteLine("你还没到结婚的年龄!");
            Console.ReadKey();

            //如果老苏的(chinese music)
            //-->语文成绩大于90并且音乐成绩大于80
            //-->语文成绩等于100并且音乐成绩大于70,则奖励100元
            Console.WriteLine("请输入你的语文成绩");
            int chinese = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("请输入你的音乐成绩");
            int music = Convert.ToInt32(Console.ReadLine());
            if (((chinese > 90 && music > 80) || (chinese == 100 && music > 70)) == true)
            {
                Console.WriteLine("你运气真好,系统奖励你100元(其实就是这几个虚拟数字而已>_<)");
            }
            else
                Console.WriteLine("系统并没有给你奖励100元,很遗憾的说!");
            Console.ReadKey();

            //让用户输入用户名和密码,如果用户名为admin,密码为mypass,则提示登陆成功
            Console.WriteLine("请输入用户名:");
            string name = Console.ReadLine();
            Console.WriteLine("请输入密码:");
            string pass = Console.ReadLine();

            if ((name == "admin" && pass == "mypass") == true)
            {
                Console.WriteLine("登陆成功呢!");
            }
            else
                Console.WriteLine("登陆失败呢!");
            Console.ReadKey();

        }
    }
}
