using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace 随机数
{
    class Program
    {
        static void Main(string[] args)
        {
            ////产生随机数
            ////1.创建能够产生随机数的对象
            ////如果将下面这行放在循环中,那么这行在设计中是错误的,因为没循环一次系统都会为这个对象创建一个新的空间,所以在某种请款上来说,这是特别浪费空间/存储的方法
            //Random r = new Random();
            ////2.让产生随机数的这个独享调用方法来产生随机数
            ////限制产生随机数的范围
            ////左闭右开区间:x∈[a,b)    相当于 a<=x<b
            //int rNumber = r.Next(1,11);   
            //Console.WriteLine(rNumber);
            //Console.ReadKey();

            //输入名字随机显示这个人上辈子是什么样的人
            //思路:
            //1.穿件能够产生随机数的对象
            //2.产生随机数(1,7)
            Random r = new Random();
            string name="";
            string quiet = "\\";
            while (name != quiet)
            {
                int rNmuber = r.Next(1, 7);
                Console.WriteLine("请输入一个姓名:(输入\"\\\"退出)");
                name = Console.ReadLine();
                if (name != quiet)
                {
                    switch (rNmuber)
                    {
                        case 1:
                            Console.WriteLine("{0}上辈子是一坨狗屎", name);
                            break;
                        case 2:
                            Console.WriteLine("{0}上辈子是一坨翔", name);
                            break;
                        case 3:
                            Console.WriteLine("{0}上辈子是一头嗷嗷嗷_嗷嗷嗷叫的野猪", name);
                            break;
                        case 4:
                            Console.WriteLine("{0}上辈子是一头驴", name);
                            break;
                        case 5:
                            Console.WriteLine("{0}上辈子是一只牛", name);
                            break;
                        case 6:
                            Console.WriteLine("{0}上辈子我是你们的爸爸", name);
                            break;
                        default:
                            Console.WriteLine("{0}你干啥?你干啥?让你输入1-7的左闭右开区间,知道不,别乱来", name);
                            break;
                    }
                }
            }
            Console.WriteLine("程序结束!");
            Console.ReadKey();
        }
    }
}
