using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace 交换变量
{
    class Program
    {
        /// <summary>
        /// 这个程序时用来交换变量的
        /// 可以交换两个变量所存储的值
        /// 这个程序使用了两种算法来交换变量
        /// </summary>
        /// <param name="args"></param>
        static void Main(string[] args)
        {
            //int n1 = 10;    //声明n1为整数类型并赋值为10
            //int n2 = 20;    //声明n2为整数类型并赋值为20
            //Console.WriteLine("交换前:n1的值是{0},n2的值是{1}",n1,n2);   //打印初始的两个值n1和n2的值为10和20
            //Console.WriteLine();    //换行


            ////交换n1和n2的值
            //int temp = n1;  //将n1的值存储在temp中
            //n1 = n2;        //将n2的值存储在n1中
            //n2 = temp;      //将temp的值存储在n2中
            //Console.WriteLine("交换后:n1的值是{0},n2的值是{1}",n1,n2);       //输出交换后的n1和n2的值
            //Console.WriteLine("输入任意字符退出程序!");                       //提示语
            //Console.ReadKey();                                              //输入任意键退出程序

            int n1 = 10;
            int n2 = 20;
            Console.WriteLine("交换之前:n1的值是{0},n2的值是{1}",n1,n2);
            Console.WriteLine();
            n1 = n1 - n2;   //10-20=-10
            n2 = n1 + n2;   //-10+20=10
            n1 = n2 - n1;   //10-(-10)=20
            Console.WriteLine("交换之后:n1的值是{0},n2的值是{1}",n1,n2);
            Console.WriteLine("输入任意键退出");
            Console.ReadKey();




        }
    }
}
