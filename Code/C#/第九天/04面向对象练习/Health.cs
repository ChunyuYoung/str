using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _04面向对象练习
{
    class Health
    {
        ~Health()           //析构函数
        {

        }
        public Health(string name,string health,int age,char ch)        //构造函数
        {
            this.Name = name;
            this.Health1 = health;
            this.Age = age;
            this.Ch = ch;
        }
        private string _name;   //私有字段_名字
        public string Name      //公有字段_名字
        {
            get { return _name; }
            set { _name = value; }
        }
        private string _health1;    //私有字段_健康状态
        public string Health1
        {
            get { return _health1; }
            set { _health1 = value; }
        }
        private int _age;           //私有字段_年龄
        public int Age
        {
            get { return _age; }
            set { _age = value; }
        }
        private char _ch;       //私有字段_性别
        public char Ch
        {
            get { return _ch; }
            set { _ch = value; }
        }

        public void strHealth()
        {
            Console.WriteLine("病人的名字是:{0},年龄是:{1},性别是:{2},健康状态:{3}",this.Name,this.Age,this.Ch,this.Health1);
        }
    }
}
