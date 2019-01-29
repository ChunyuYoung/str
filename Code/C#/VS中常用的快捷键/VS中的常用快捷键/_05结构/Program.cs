using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _05结构
{
    public struct Person        //结构
    {
        public string _name;    //字段和变量的命名规则区别,前面加_
        public int _age;
        public Gender _gender;  //枚举赋值
    }
    public enum Gender          //枚举
    {
        男,
        女
    }
    class Program
    {
        static void Main(string[] args)
        {
            Person zsPerson;
            zsPerson._name = "张三";
            zsPerson._age = 21;
            zsPerson._gender = Gender.男;        //枚举_赋值

            Person lsPerson;
            lsPerson._name = "李四";
            lsPerson._age = 19;
            lsPerson._gender = Gender.女;        //枚举_赋值

            Console.WriteLine(zsPerson._name);
            Console.WriteLine(lsPerson._name);
            Console.ReadKey();
        }
    }
}
