using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _08类型转换
{
    class Program
    {
        static void Main(string[] args)
        {
            //使用Convert进行转换,成功了好说,失败了会抛异常
            //int numberOne = Convert.ToInt32("1230");

            //Convert在使用中会调用Parse
            //直接使用Parse会比Convert效率更高
            //二者效果是相同的

            //int number = int.Parse("123abc");
            //Console.WriteLine(number);

            int number = 0;
            //参数 返回值
            bool b = int.TryParse("123", out number);
            Console.WriteLine(b);
            Console.WriteLine(number);
            //方法 或者 函数?
            Console.ReadKey();
        }
    }
}
