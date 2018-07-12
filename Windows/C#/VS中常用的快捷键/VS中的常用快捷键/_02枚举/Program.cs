using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _02枚举
{
    //声明了一个枚举 Gender
    public enum Gender
    {
        男,
        女
    }
    class Program
    {
        static void Main(string[] args)
        {
            //变量类型 变量名 = 值;
            Gender gender = Gender.男;
        }
    }
}
