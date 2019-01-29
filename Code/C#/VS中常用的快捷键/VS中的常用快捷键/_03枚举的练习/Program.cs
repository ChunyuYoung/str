using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _03枚举的练习
{
    public enum Seeons
    {
        春,
        夏,
        秋,
        冬
    }
    public enum QQState
    {
        OnLine,
        OffLine,
        Leave,
        Busy,
        QMe
    }
    class Program
    {
        static void Main(string[] args)
        {
            Seeons s = Seeons.春;
            QQState State = QQState.QMe;
            Console.WriteLine(State);
            Console.WriteLine(s);
            Console.ReadKey();
        }
    }
}
