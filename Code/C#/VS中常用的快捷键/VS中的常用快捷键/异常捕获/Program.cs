using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace 异常捕获
{
    class Program
    {
        static void Main(string[] args)
        {
            //语法上没有错误,在程序运行的过程中,由于某些原因程序出现了错误,不能再正常的运行
            bool b = true;
            int number = 0; //声明一个变量
            Console.WriteLine("请输入一个数字");
            //有可能会出现异常的代码
            try
            {   
                //如果输入字符会导致数据类型转换异常
                number = Convert.ToInt32(Console.ReadLine());   //赋值
            }
            //出现异常代码的解决方案
            catch
            {
                Console.WriteLine("输入的内容不能够转换成数字");
                b = false;
            }
            //我们如果需要执行下面这行代码,需要满足某些条件
            //让代码满足某些条件去执行的话,使用bool类型
            //写完代码之后纵观全局找到有可能会出现异常的代码再去写try和cach,因为至少我们也不确定哪行会出现异常
            if (b)
            {
                Console.WriteLine(number * 2);  //使用number的值
            }
            Console.ReadKey();
        }
    }
}
