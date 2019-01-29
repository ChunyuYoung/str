using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace 练习
{
    class Program
    {
        static void Main(string[] args)
        {
            #region 比较三个数字的大小
            //比较3个数字的大小不考虑相等
            Console.WriteLine("请输入第一个数字");
            int NumberOne = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("请输入第二个数字");
            int NumberTwo = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("请输入第三个数字");
            int NumberThree = Convert.ToInt32(Console.ReadLine());

            //如果第一个数字大于第二个数字 并且 第一个数字大于第三个数字
            if (NumberOne > NumberTwo && NumberOne > NumberThree)
            {
                Console.WriteLine(NumberOne);
            }
            //如果第二个数字大于第一个数字 并且 第二个数字大于第三个数字
            else if (NumberTwo > NumberOne && NumberTwo > NumberThree)
            {
                Console.WriteLine(NumberTwo);
            }
            //如果第三个数字大于第一个数字 并且 第三个数字大于第二个数字
            else
            {
                Console.WriteLine(NumberThree);
            }
            Console.ReadKey();
            #endregion

            #region 判断输入的密码是否正确
            //练习一:提示用户输入密码,如果密码是"88888"则提示正确,否则再输入一次,如果密码是"88888"则提示正确,负责提示错误,程序结束(如果我的密码里有英文还要转换吗,密码:abc1)
            Console.WriteLine("请输入密码");
            string psw = Console.ReadLine();
            if (psw == "88888")
            {
                Console.WriteLine("正确");
            }
            else
            {
                Console.WriteLine("错误,请重新输入:");
                psw = Console.ReadLine();
                if (psw == "88888")
                {
                    Console.WriteLine("正确");
                }
                else
                {
                    Console.WriteLine("错误,程序结束");
                }
            }
            Console.ReadKey();
            #endregion

            #region 判断用户名和密码是否正确/存在
            //练习2:提示用户输入用户名,然后在提示输入密码,如果用户名是"admin"并且密码是"88888",则提示正确,否则,如果用户明不是"admin"还提示用户名不存在,如果用户名是admin则提示密码错误.
            Console.WriteLine("请输入用户名:");
            string name = Console.ReadLine();
            Console.WriteLine("请输入密码:");
            string password = Console.ReadLine();

            //如果用户名等于admin 并且 密码等于88888
            if (name == "admin" && password == "88888")
            {
                Console.WriteLine("正确");
            }
            //否则提示密码错误
            else
            {
                Console.WriteLine("错误,请重新输入用户名:");
                name = Console.ReadLine();
                //如果账户不是admin则提示用户名不存在
                if (name != "admin")
                {
                    Console.WriteLine("用户名不存在!");
                }
                //如果用户名是admin则提示密码错误
                else if (name == "admin")
                {
                    Console.WriteLine("密码错误");
                }
            }
            Console.ReadKey();
            #endregion

            //练习3:提示用户输入年龄,如果大于等于18,则告知用户可以查看,如果小于10岁,则告知不允许查看,如果大于等于10岁并且小于18,则提示用户名是否继续查看(yes,no),如果输入的是yes则提示用户请查看,否则提示"退出,你放弃查看"
            Console.WriteLine("请输入与年龄:");
            int age = Convert.ToInt32(Console.ReadLine());
            //如果年龄大于等于18岁
            if (age >= 18)
            {
                Console.WriteLine("可以查看!");
            }
            //则如果年龄小于10
            else if (age < 10)
            {
                Console.WriteLine("不可以查看!");
            }
            //则如果年龄大于等于10 并且 年龄小于10
            else if (age >=10 && age < 18)
            {
                Console.WriteLine("是否继续查看:yes/no");
                string yn = Console.ReadLine();
                //输入yes/no继续/终止程序
                if (yn == "yse")
                {
                    Console.WriteLine("可以继续查看");
                }
                else
                {
                    Console.WriteLine("退出,你放弃查看");
                }
            }
            Console.ReadKey();
        }
    }
}
