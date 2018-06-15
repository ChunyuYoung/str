using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace 加号的使用
{
    class Program
    {
        /// <summary>
        /// 课后题卡卡西的个人信息
        /// </summary>
        /// <param name="args"></param>
        static void Main(string[] args)
        {
            //
            string name = "卡" + "卡" + "西";
            int age = 18;
            string mail = "kakaxi" + "@qq.com";
            decimal money = 2000;
            string home = "火影村";
            Console.WriteLine("我的名字是{0},我今年{1},我的邮箱是{2},我的工资是{3},我的家庭住址在{4}",name,age,mail,money,home);
            Console.ReadKey();

        }
    }
}
