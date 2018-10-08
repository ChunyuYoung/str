using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _01复习
{
    public class Health             //默认是私有的,如果需要跨项目调用类需要加上public
    {
        public Health(string name,int age,char ch,string h1)        //构造函数,就诊
        {
            this.Name = name;
            this.Age = age;
            this.Ch = ch;
            this.H1 = h1;
        }
        public Health(string name, int age, char ch)        //构造函数重载,预约
        {

        }
        private string _name;
        public string Name
        {
            get {
                if (_name == "史钿睿")             //判断病人名字是否合法
                {
                    return _name = "空白";        //病人名字非法,则强制跟换为""
                }
                return _name; }
            set { _name = value; }
        }
        private int _age;
        public int Age
        {
            get { return _age; }
            set {
                if (_age <= 0 && _age >= 100)       //判断年龄是否合法
                {
                    _age = 20;                      //年龄非法将自动重置为"20"
                }
                _age = value; }
        }
        private char _ch;
        public char Ch
        {
            get {
                if (_ch == '男' || _ch == '女')       //判断性别是否合法
                {
                    return _ch;
                }
                else if (_ch != '男' || _ch != '女')  
                {
                    _ch = '男';                  //如果不合法,则强制重新赋值为"男"
                }
                return _ch; }
            set {_ch = value; }
        }
        private string _h1;
        public string H1
        {
            get {
                if (_h1 == "健康" || _h1 == "糟糕")     //判断健康程度是否合法
                {
                    return _h1;
                }
                else if (_h1 != "健康" || _h1 != "糟糕")
                {
                    return _h1 = "糟糕";              //如果健康取值非法,则重置为"糟糕"
                }
                return _h1; }
            set { _h1 = value; }
        }
        public void strh1()
        {
            Console.WriteLine("病人的名字是:{0},年龄是:{1},性别是:{2},健康状态是:{3}", this.Name, this.Age, this.Ch, this.H1);
        }
    }
}
