using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _04枚举和int以及string类型之间的转换
{
    public enum QQstate
    {
        OnLine=1,
        OffLine,
        Leave,
        Busy,
        QMe
    }
    public enum Gender
    {
        男,
        女
    }
    class Program
    {
        static void Main(string[] args)
        {
            #region 将枚举类型转换为int类型
            //QQstate state = QQstate.QMe;
            ////枚举类型默认可以和int类型互相转换    枚举类型和int类型是兼容的
            //int n = (int)state;
            //Console.WriteLine(n);
            //Console.ReadKey();
            #endregion

            #region 将int类型强制转化为枚举类型
            //int n1 = 3;
            //QQstate state = (QQstate)n1;
            //Console.WriteLine(state);
            //Console.ReadKey(); 
            #endregion

            #region 将枚举类型转换为字符串类型
            //所有的类型都能够转换成为string类型
            //int n1 = 10;
            //double n1 = 100.5;
            //decimal n1 = 159;
            //string s= n1.ToString();
            //Console.WriteLine(s);
            //Console.ReadKey();

            //QQstate state = QQstate.OnLine;
            //string s = state.ToString();
            //Console.WriteLine(s);
            //Console.ReadKey(); 
            #endregion

            #region 将字符串类型转换为枚举类型
            //string s = "0";
            ////将s转换成枚举类型
            ////Convert.ToInt32() int.parse() int.TryParse()
            ////调用Parse(0方法的目的就是为了让它帮助我们将一个字符串转换成对应的枚举类型
            //QQstate state =(QQstate) Enum.Parse(typeof(QQstate), s);
            //Console.WriteLine(state);
            //Console.ReadKey(); 
            #endregion

            //枚举练习
            //提示用户选择一个在线状态,哦们接收,并将用户的输入转换成枚举类型.
            //再次打印到控制台

            Console.WriteLine("请选择您的QQ在线状态 1--OnLine 2--OffLine 3--Leave 4--Busy");
            string input = Console.ReadLine();
            switch (input)
            {
                case "1":QQstate s1 =(QQstate)Enum.Parse(typeof(QQstate), input);
                    Console.WriteLine("你选择的在线状态是{0}", s1);
                    break;
                case "2":QQstate s2=(QQstate)Enum.Parse(typeof(QQstate), input);
                    Console.WriteLine("你选择的在线状态是{0}", s2);
                    break;
                case "3":QQstate s3 = (QQstate)Enum.Parse(typeof(QQstate), input);
                    Console.WriteLine("你选择的在线状态是{0}", s3);
                    break;
                case "4":QQstate s4 = (QQstate)Enum.Parse(typeof(QQstate), input);
                    Console.WriteLine("你选择的在线状态是{0}", s4);
                    break;
            }
            Console.ReadKey();
        }
    }
}
