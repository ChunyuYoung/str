using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace switch_case_练习
{
    class Program
    {
        static void Main(string[] args)
        {
            #region 根据姓名分析这个人上辈子的职业
            ////让用户输入姓名,然后显示出这个人上辈子是什么职业.
            //Console.WriteLine("请输入一个名字,我们会进行分析这个人上辈子的的职业是什么");
            //string name = Console.ReadLine();
            //switch (name)
            //{
            //    case "李嘎":Console.WriteLine("他上辈子是个二狗子");
            //        break;
            //    case "羊大便":Console.WriteLine("他上辈子是一坨翔");
            //        break;
            //    case "王二狗":Console.WriteLine("他上辈子是一个职业基佬");
            //        break;
            //    case "井噶":Console.WriteLine("他上辈子是一个\"管子\"");
            //        break;
            //    default:Console.WriteLine("他上辈子是一对翔");
            //        break;
            //}
            //Console.ReadKey(); 
            #endregion

            //根据考试成绩判断等级
            Console.WriteLine("请输入考试成绩");
            int score = Convert.ToInt32(Console.ReadLine());

            switch (score/10)
            {
                //case10和case9的代码一致的情况下就可以省略前面一行相同的代码
                //case 10:Console.WriteLine("A");
                //  break;
                case 10:    //数字不加引号,字符char类型加单引号,字符串string类型加双引号
                case 9:Console.WriteLine("A");
                    break;
                case 8:Console.WriteLine("B");
                    break;
                case 7:Console.WriteLine("C");
                    break;
                case 6:Console.WriteLine("E");
                    break;
                default:Console.WriteLine("F");
                    break;
            }
            Console.ReadKey();
        }
    }
}
