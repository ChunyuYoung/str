using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using _01复习;

namespace _02_命名空间
{
    class Program
    {
        static void Main(string[] args)
        {
            //快速打开命名空间修正Ait+Shift=F10
            //List<int> list = new List<int>();
            
            //引用"_01复习"的Person类
            Person p = new Person("李四",19,'女');
            p.sayHello();
            Console.ReadKey();

        }
    }
}
