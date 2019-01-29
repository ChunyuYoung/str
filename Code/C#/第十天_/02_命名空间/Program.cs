using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using _01复习;            //跨项目调用01复习项目下的方法

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
            //引用01复习项目下的Health类
            Health h1 = new Health("史珍香", 19, '男', "重病");
            h1.strh1();
            Console.ReadKey();

        }
    }
}
