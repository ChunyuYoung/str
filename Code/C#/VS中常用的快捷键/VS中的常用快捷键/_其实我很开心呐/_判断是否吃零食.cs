using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _其实我很开心呐
{
    class _判断是否吃零食
    {
        public _判断是否吃零食(string Eat)
        {
            _eat = Eat;
    }
        private string _eat;
        public string Eat
        {
            get { return _eat; }
            set
            {
                if (_eat == "吃")
                {
                    Console.WriteLine("谢谢,我不想吃");
                }
                else if (_eat == "不吃")
                {
                    Console.WriteLine("emmmmm,我买了好多呢!");
                }
                _eat = value;
            }
        }
    }
}
