using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _10ref参数
{
    class Program
    {
        static void Main(string[] args)
        {
            //使用方法来交换两个int类型的变量
            //第一种交换变量的方法:使用一个第三方参数来交换
            //int temp = n1;
            //n1 = n2;
            //n2 = n1;
            int n1 = 10;
            int n2 = 20;
            Program.N1N2(ref n1,ref n2);
            Console.WriteLine(n1);
            Console.WriteLine(n2);
            Console.ReadKey();

            //第二种交换变量的方法:仅仅使用两个值本身交换变量
            //n1 = n1 - n2;   //n1 = -10  n2 = 20
            //n2 = n1 + n2;   //n2 = 10   n1 = -10
            //n1 = n2 - n1;   //n2 = 10   n1 = 20

        }
        public static void N1N2(ref int n1,ref int n2)
        {
            //n1 = 10;
            //n2 = 20;
            int temp = n1;
            n1 = n2;
            n2 = temp;
        }
    }
}
