using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _04字符串
{
    class str
    {
        public str(string name,char chname)       //形参
        {
            this.Name = name;           //字符串:名字
            this.ChName = chname;         //数组:名字
        }
        private string _name;       //初始化名字静态字段
        public string Name
        {
            get { return _name; }
            set { _name = value; }
        }
        private char _chName;       //初始化字符数组静态字段
        public char ChName
        {
            get { return _chName; }
            set { _chName = value; }
        }
    }
}
