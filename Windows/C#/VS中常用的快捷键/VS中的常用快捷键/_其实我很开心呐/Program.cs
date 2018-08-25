using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _其实我很开心呐
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("旁白:在学校,你坐在操场的草坪上发呆");
            Console.WriteLine("旁白:你在思考着一你现在的生活,想象自己以后会成为怎样的人");
            Console.WriteLine();
            Console.ForegroundColor = ConsoleColor.Green;
            Console.WriteLine("---------------------------------------------------");
            Console.ForegroundColor = ConsoleColor.White;
            Console.WriteLine("你看到了一个女生提着一袋零食坐在你旁边");
            Console.WriteLine("那个女生问你要吃零食吗?");
            string Eat = Console.ReadLine();
            _判断是否吃零食 eat = new _判断是否吃零食(Eat);
            Console.WriteLine(eat);
            Console.ReadKey();
        }
    }
}
