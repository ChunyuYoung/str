using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
namespace _04字符串
{
    class Program
    {
        static void Main(string[] args)
        {
            //s1栈和s2栈指向同一个"123"堆
            //string s1 = "123";
            //string s2 = "123";
            //Console.ReadKey();

            //可以将字符看作是char类型的一个只读数组.
            string s = "abcdefg";
            //s[0] = 'b'; 不能这样做 因为它是只读的
            //首先将字符串转换为char类型的数组
            char[] chs = s.ToCharArray();
            chs[0] = 'b';
            //将字符数组转换为字符串
            s = new string(chs);
            //既然可以将string看成char类型的只读数组,所以我们可以通过下标去访问字符串中的某一个元素
            Console.WriteLine(s[0]);
            Console.WriteLine(s);

            //str字符串分割数组
            

            Console.ReadKey();
        }
    }
}
