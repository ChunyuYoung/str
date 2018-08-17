using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _02方法的练习
{
    class Program
    {
        static void Main(string[] args)
        {
            #region 第95题
            //95.接收输入后判断其等级并显示出来
            //判断依据如下:等级={优 (90~100分); 良(80-89分)}
            //Console.WriteLine("请输入考试成绩(整数)");
            //string strNumber = Console.ReadLine();
            //int score = Program.Number(strNumber);
            //string level = Program.Level(score);
            //Console.WriteLine(level);
            //Console.ReadKey(); 
            #endregion
            #region 第97题
            //97.请将字符串数组{"中国","美国","巴西","澳大利亚","加拿大"}中的内容反转
            //在方法中数组可以不写返回值(在方法中不写返回值的必须是数组)
            //string[] names = { "中国", "美国", "巴西", "澳大利亚", "加拿大" };
            //Name(names);
            //for (int i = 0; i < names.Length; i++)
            //{
            //    Console.WriteLine(names[i]);
            //}
            //Console.ReadKey(); 
            #endregion
            #region 第98题
            //98.写一个方法 计算圆的面积和周长 面积是Pi*r*r 周长是2*pi*r
            //double r = 5;
            //double Pertimeter;
            //double Area;
            //GetPerimeterArea(r, out Pertimeter, out Area);
            //Console.WriteLine("面积是:{0}", Area);
            //Console.WriteLine("周长是:{0}", Pertimeter);
            //Console.ReadKey(); 
            #endregion
        }
        /// <summary>
        /// 计算圆的周长和面积
        /// </summary>
        /// <param name="r">半径</param>
        /// <param name="Pertimeter">周长</param>
        /// <param name="Area">面积</param>
        /// <returns>返回半径和周长和面积</returns>
        public static double GetPerimeterArea(double r, out double Pertimeter, out double Area)
        {
            Pertimeter = 2 * 3.14 * r;
            Area = 3.14 * r * r;
            return r;
        }
        /// <summary>
        /// 倒序排列数组
        /// </summary>
        /// <param name="names"></param>
        public static void Name(string[] names)
        {
            for (int i = 0; i < names.Length / 2; i++)
            {
                string temp = names[i];
                names[i] = names[names.Length - 1 - i];
                names[names.Length - 1 - i] = temp;
            }
        }
        /// <summary>
        /// 判断成绩的等级
        /// </summary>
        /// <param name="score">分数</param>
        /// <returns>返回等级</returns>
        public static string Level(int score)
        {
                switch (score / 10)
                {
                    case 10:
                    case 9: return "优";
                    case 8: return "良";
                    case 7: return "中";
                    case 6: return "及格";
                    default: return "不及格";
                }
        }
        /// <summary>
        /// 转换为一个整数
        /// </summary>
        /// <param name="strNumber">需要转换的字符</param>
        /// <returns>返回一个整数</returns>
        public static int Number(string strNumber)
        {
            while (true)
            {
                try
                {
                    int number = Convert.ToInt32(strNumber);
                    return number;
                }
                catch
                {
                    Console.WriteLine("错误:请输入整数!");
                    strNumber = Console.ReadLine();
                }
            }
        }
    }
}
