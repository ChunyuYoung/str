using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace 小复习
{
    class Program
    {
        static void Main(string[] args)
        {
            /*
             变量类型:int,double,string,decimal, bool
             运算符:
             赋值运算符:=
             符合运算符:+= -= *= /= %=
             算数运算符:+ - * / % ++ --
             关系运算符:> < >= <= == !=
             逻辑运算符: && || !
             类型转换:
             1.自动类型转换 小转大 int-->double
             2.强制类型转换 大转小 double-->int
             3.Convert
             */
            string s1="";
            s1 = strString(s1);
            Console.WriteLine(s1);
            Console.ReadKey();
        }
        /// <summary>
        /// 打印一段字符串
        /// </summary>
        /// <param name="s1">被字符串赋值的变量</param>
        /// <returns>返回一个字符串类型变量</returns>
        public static string strString(string s1)
        {
            s1 = "“03判断闰年.exe”(CLR v4.0.30319: DefaultDomain): 已加载“C:\\Windows\\Microsoft.Net\assembly\\GAC_32\\mscorlib\v4.0_4.0.0.0__b77a5c561934e089\\mscorlib.dll”。已跳过加载符号。模块进行了优化，并且调试器选项“仅我的代码”已启用.\n" + "“03判断闰年.exe”(CLR v4.0.30319: DefaultDomain): 已加载“F:\\work\\Project\\Source\\Repos\\str\\Windows\\C#\\VS中常用的快捷键\\VS中的常用快捷键\03判断闰年\bin\\Debug\03判断闰年.exe”。已加载符号.\n" + "程序“[6908] 03判断闰年.exe: 程序跟踪”已退出，返回值为 0 (0x0).\n" + "程序“[6908] 03判断闰年.exe”已退出，返回值为 0 (0x0).";
            return s1;
        }
    }
}
