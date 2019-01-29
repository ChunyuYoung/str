using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _01面向对象
{
    class PC
    {
        private string _name;   //字段是私有的
        public string Name      //属性是公用的,语法上允许私有,但逻辑上不允许私有
        {
            get { return _name; }
            set {
                if (value != "战神")   //在set里面判断的是value的值
                {
                    value = "战神";
                }
                _name = value; }
        }
        private int _money;
        public int Money
        {
            get {
                if (_money != 5100)    //在get里面判断的是字段的值
                {
                    _money = 5100;
                }
                return _money; }
            set { _money = value; }
        }
        public void PComputer()
        {
            Console.WriteLine("我的电脑是{0},价格是{1}", this.Name, this.Money);
        }
    }
}
