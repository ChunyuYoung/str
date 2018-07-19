using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _01复习
{
    public enum Gender
    {
        男,
        女
    }
    public struct Person
    {
        public string _name;
        public int _age;
        public Gender _gender;
    }
    class Program
    {
        public static int number = 10;
        static void Main(string[] args)
        {
            //const int number = 10;
            //Gender gender = Gender.男;
            //string s = "男";
            //Gender s1 = (Gender)Enum.Parse(typeof(Gender),s);
            //Console.WriteLine(s1);
            //Console.ReadKey();

            //Person zsPerson;
            //zsPerson._name = "张三";
            //zsPerson._age = 17;
            //zsPerson._gender = Gender.男;

            Console.WriteLine(number);
            Console.ReadKey();
        }
    }
}
