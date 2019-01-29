using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _08继承
{
    public class Student : Person
    {
        public Student(string name,int age,char gender,string zhiwu) : base(name,age,gender)
        {
            this.ZhiWu = zhiwu;
        }
        private string _zhiWu;
        public string ZhiWu
        {
            get { return _zhiWu; }
            set { _zhiWu = value; }
        }
    }
}
