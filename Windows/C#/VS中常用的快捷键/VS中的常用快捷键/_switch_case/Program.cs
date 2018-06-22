using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _switch_case
{
    class Program
    {
        static void Main(string[] args)
        {
            //李四的年终工作评定
            //如果定位A等级,则工资涨500元
            //如果定位B级,则工资涨200元
            //如果定位C级,工资不变
            //如果定为D级工资降低200元
            //如果定为E级工资降500元

            #region if-else-if语句编写
            //double salary = 5000;
            //bool b = true;
            //Console.WriteLine("请输入工资等级");
            //string leveal = Console.ReadLine();
            //if (leveal=="A")
            //{
            //    salary += 500;
            //}
            //else if (leveal=="B")
            //{
            //    salary += 200;
            //}
            //else if (leveal=="C")
            //{

            //}
            //else if (leveal=="D")
            //{
            //    salary -= 200;
            //}
            //else if (leveal=="E")
            //{
            //    salary -= 500;
            //}
            //else
            //{
            //    Console.WriteLine("请输入正确的等级");
            //    b = false;
            //}
            //if (b)
            //{
            //    Console.WriteLine("明年工资是:{0}", salary);
            //}
            //Console.ReadKey();
            #endregion

            //switch (变量或者表达式的值)
            //{
            //    case 值1:
            //        要执行的代码;
            //        break;
            //    case 值2:
            //        要执行的代码;
            //        break;
            //    case 值3:
            //        要执行的代码;
            //        break;
            //     ...
            // default:
            //        要执行的代码;
            //        break;
            //}
            double salary = 5000;
            bool b = true;
            Console.WriteLine("请输入工资等级");
            string leveal = Console.ReadLine();
            switch (leveal)
            {
                case "A":salary += 500;
                    break;
                case "B":salary += 200;
                    break;
                case "C":break;
                case "D":salary -= 200;
                    break;
                case "E":salary -= 500;
                    break;
                default:Console.WriteLine("错误:请输入正确的值");
                    b = false;
                    break;
            }
            if (b)
            {
                Console.WriteLine("李四明年的工资是:{0}元", salary);
            }
            Console.ReadKey();
            
            //设李四的元工资为5000,请用户输入李四的评级,然后显示李四来年的工资.

        }
    }
}
