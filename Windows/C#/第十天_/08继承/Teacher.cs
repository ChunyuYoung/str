using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _08继承
{
    public class Teacher : Student
    {
        public Teacher(string name, int age, char gender,string zhiwu) : base(name, age, gender,zhiwu)
        {
            this.ZhiWu = zhiwu;
        }
        public void Tec()
        {
            Console.WriteLine("我是{0},我{1}岁了,我是{2}生,我的工作是{3}", this.Name, this.Age, this.Gender, this.ZhiWu);
        }
    }
}
