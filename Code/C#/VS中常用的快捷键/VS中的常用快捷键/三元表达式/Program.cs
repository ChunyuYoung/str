using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace 三元表达式
{
    class Program
    {
        static void Main(string[] args)
        {
            #region 使用if和else判断两个值的大小
            ////计算两个数字的大小,求出最大的
            //Console.WriteLine("输入第一个值");
            //int n1 = int.Parse(Console.ReadLine());
            //Console.WriteLine("输入第二个值");
            //int n2 = int.Parse(Console.ReadLine());
            //if (n1 > n2)
            //{
            //    Console.WriteLine("最大值为:{0}", n1);
            //}
            //else
            //{
            //    Console.WriteLine("最大值为:{0}", n2);
            //}
            //Console.ReadKey();
            #endregion

            #region 三元表达式判断两个值得大小
            ////三元表达式
            ////表达式1?表达式2:表达式3;
            //Console.WriteLine("请输入第一个值:");
            //int n1 = int.Parse(Console.ReadLine());
            //Console.WriteLine("请输入第二个值:");
            //int n2 = int.Parse(Console.ReadLine());
            //int max = n1 > n2 ? n1 : n2;
            //Console.WriteLine("最大的是:{0}", max);
            //Console.ReadKey(); 
            #endregion

            #region 使用if和else判断是否是人才
            ////提示用户输入一个姓名 只要输入的不是老赵 就全是流氓
            //Console.WriteLine("请输入你的名字!");
            //string name = Console.ReadLine();
            //if (name == "老赵")
            //{
            //    Console.WriteLine("人才啊!");
            //}
            //else
            //{
            //    Console.WriteLine("流氓啊!");
            //}
            //Console.ReadKey(); 
            #endregion

            #region 使用三元表达式判断输入的是否是人才
            ////三元表达式
            ////输入一个姓名判断是否是人才
            //Console.WriteLine("请输入你的名字!");
            //string name = Console.ReadLine();
            //string str_name = name == "老赵" ? "人才啊" : "流氓啊";
            ////Console.WriteLine("{0}", str_name);
            //Console.WriteLine(str_name);
            //Console.ReadKey(); 
            #endregion

        }
    }
}
