using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _01面向对象
{
    public class Person
    {
        public string _name;
        public int _age;
        public char _gender;


        public void CHLSS()
        {
            Console.WriteLine("我叫{0},我今年{1},我是{2}生,吃喝拉撒睡",this._name,this._age,this._gender);

        }
    }
}
