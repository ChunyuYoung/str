using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _01面向对象
{
    class Storage
    {
        private string _name;
        public string Name
        {
            get { return _name; }
            set {
                if (value != "大硬盘")
                {
                    value = "大硬盘";
                }
                _name = value; }
        }
        private int _rom;
        public int Rom
        {
            get {
                if (_rom != 1)
                {
                    _rom = 1;
                }
                return _rom; }
            set { _rom = value; }
        }

        public void writeStorage()
        {
            Console.WriteLine("我的存储器名字是{0},它有{1}TB", this.Name, this.Rom);
        }
    }
}
