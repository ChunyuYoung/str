using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace 转义字符
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("今天是晴天!\n今天或许是一个写代码的好日子!");
            Console.WriteLine("在C#中\"Public\"是一个关键字");
            Console.WriteLine("---我---是---分---割---线---");
            Console.WriteLine("烤肠\t鸡腿");
            Console.WriteLine("牛肉\t肥瘦肉夹馍");
            Console.WriteLine("---我---是---分---割---线---");
            Console.WriteLine("原始字符串:C#程序设计从入门到放弃");
            Console.WriteLine("更改字符串:C#\b程序设计从\b入门到放弃\b");
            Console.WriteLine("---我---是---分---割---线---");
            Console.WriteLine("C#视频文件路径:\tF:\\视频\\学习\\C#语言\\亲情奉献全套精品.Net基础视频教程之2-C#基础\\（第二天）\\video");
            Console.WriteLine("C#工作目录:\tF:\\work\\Project\\Source\\Repos\\str\\Windows_程序开发工程目录\\C#");
            Console.WriteLine(@"程序结束(输入任意字符(q则退出)");
            Console.ReadKey();
        }
    }
}
