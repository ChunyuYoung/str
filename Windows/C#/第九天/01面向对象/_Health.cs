using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _01面向对象
{
    class _Health
    {
        private string _name;
        public string Name
        {
            get { return _name; }
            set { _name = value; }
        }
        private string _health;
        public string Health {
            get { return _health; }
            set { _health = value; }
        }
        public void hlHealth() {
            Console.WriteLine("病人姓名:{0},病人健康状态:{1}", this.Name, this.Health);
        }
    }
}
