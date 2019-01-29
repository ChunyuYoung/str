using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace 加加减减
{
    class Program
    {
        static void Main(string[] args)
        {
            //int number = 10;
            ////number++;
            ////++number;   //number=number+1
            //number--;
            //--number;
            //Console.WriteLine(number);
            //Console.ReadKey();

            int a = 5;
            int b = a++ + ++a * 2 + --a + a++;
            //a++ = 5然后+ ++a=6 * 2 + 5 + 6(在计算完才会再加1,所以a可能会等于7)
            Console.WriteLine(a);  
            Console.WriteLine(b);   
            Console.ReadKey();
        }
    }
}
