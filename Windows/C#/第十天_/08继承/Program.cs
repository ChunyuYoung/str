using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _08继承
{
    class Program
    {
        static void Main(string[] args)
        {
            Teacher t = new Teacher("翠花", 19, '女', "援交妹");
            t.Tec();
            Console.ReadKey();
        }
    }
}
