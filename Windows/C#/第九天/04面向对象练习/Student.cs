using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _04面向对象练习
{
    class Student
    {
        //当程序结束时,析构函数才会执行
        //帮助我们释放资源
        //GC Garbage Collection
        //如果希望我们懂得程序在程序结束时立刻释放资源则使用析构函数
        //如果我们不希望资源在程序结束时立刻释放资源,则我们不写析构函数,程序会自动使用GC垃圾回收来释放资源
        ~Student()  //析构函数
        {
            Console.WriteLine("我是析构函数");
        }

        public Student(string name,int age,char gender,int chinese,int math,int english)        //构造函数
        {
            this.Name = name;
            this.Age = age;
            this.Gender = gender;
            this.Chinese = chinese;
            this.Math = math;
            this.English = english;
        }
        public Student(string name, int chinese, int math, int english):this(name,0,'0',100,100,100)    //调用全参构造函数
        {

        }
        private string _name;
        public string Name     //姓名
        {
            get { return _name; }
            set { _name = value; }
        }
        private int _age;
        public int Age      //年龄
        {
            get { return _age; }
            set {
                if (value < 0 && value > 100)
                {
                    value = 0;
                }
                _age = value; }
        }
        private char _gender;
        public char Gender      //性别
        {
            get { return _gender; }
            set {
                if (value != '男' && value != '女')
                {
                    value = '男';
                }
                _gender = value; }
        }
        private int _chinese;
        public int Chinese      //中文成绩
        {
            get {
                if (_chinese < 0 || _chinese > 100)
                {
                    return _chinese = 0;
                }
                return _chinese; }
            set { _chinese = value; }
        }
        private int _math;
        public int Math     //数学成绩
        {
            get {
                if (_math < 0 || _math > 100)
                {
                    return _math = 0;
                }
                return _math; }
            set { _math = value; }
        }
        private int _english;
        public int English      //英文成绩
        {
            get {
                if (_english < 0 || _english > 100)
                {
                   return _english = 0;
                }
                return _english; }
            set { _english = value; }
        }
        public void xiaoLan()
        {
            Console.WriteLine("我叫{0},我{1}岁了,我是{2}生,我的中文成绩是{3}分,我的数学成绩是{4}分,我的英文成绩是{5}分", this.Name, this.Age, this.Gender, this.Chinese, this.Math, this.English);
        }
        public void xlScore()
        {
            Console.WriteLine("我的总成绩是{0}分,平均成绩是{1}分", this.Chinese + this.Math + this.English, (this.Chinese + this.Math + this.English) / 3);
        }
        public void liHua()
        {
            Console.WriteLine("我叫{0},我的中文成绩是{1}分,我的数学成绩是{2}分,我的英语成绩是{3}分", this.Name, this.Chinese, this.Math, this.English);
        }
    }
}
