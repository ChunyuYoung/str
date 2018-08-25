using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _01复习
{
    public class Person
    {
        //字段,属性,方法,构造函数
        //字段:存储数据
        //属性:保护字段,对字段的取值和赋值进行限定
        //方法:描述对象的行为(给对象的每个属性一次的赋值)
        //类中的成员,如果不加访问修饰符,默认都是private
        //构造函数:1.没有返回值 连void也没有
                //2.构造含糊的名称和类名一样
        //this:当前类额对象
        //this:调用当前类的构造函数
        //不加this表示局部变量
        //构造函数可以重载

            
        public Person(string name,int age,char gender)
        {
            this.Name = name;
            this.Age = age;
            if (gender != '男' && gender != '女')
            {
                gender = '男';
            }
            this.Gender = gender;
        }
        public Person(string name):this(name,0,'0')
        {

        }
        private string _name;
        public string Name
        {
            get {
                if (_name != "小羊")
                {
                    return _name = "小羊";
                }
                return _name; }
            set { _name = value; }
        }
        private int _age;
        public int Age
        {
            get { return _age; }
            set {
                if (value < 0 || value > 100)
                {
                    value = 20;
                }
                _age = value; }
        }
        private char _gender;
        public char Gender
        {
            get { return _gender; }
            set { _gender = value; }
        }
        public void sayHello()
        {
            Console.WriteLine("我的名字是{0},我今年{1}岁了,我是{2}生", this.Name, this.Age, this.Gender);
        }
        public void twoName()
        {
            Console.WriteLine("我是{0},今年{1}岁", this.Name, this.Age);
        }
    }
}
