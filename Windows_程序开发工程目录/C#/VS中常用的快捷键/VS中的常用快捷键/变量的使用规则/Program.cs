using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace 变量的使用规则
{
    class Program
    {
        /// <summary>
        /// 这算是一个自我介绍的程序
        /// </summary>
        /// <param name="args"></param>
        static void Main(string[] args)
        {
            
            string name = "空白";
            int age = 18;
            char gender = '男';
            string QQ = "2719859320";
            Console.WriteLine("我的名字是{0},我今年{1}岁,我是{2}生,我的QQ账号是:{3}", name, age, gender, QQ);
            Console.WriteLine("输入任意字符退出程序!");
            Console.ReadKey();
        }
    }
}
