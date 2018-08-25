using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _01面向对象
{
    class Program
    {
        static void Main(string[] args)
        {
            //创建Person类的对象
            Person suQuan = new Person();
            suQuan._name = "孙权";
            suQuan._age = 23;
            suQuan._gender = '男';
            suQuan.CHLSS();
            //创建一个笔记本类的对象
            PC Computer = new PC();
            Computer.Name = "神州_战神";
            Computer.Money = 5300;
            Computer.PComputer();
            //创建一个大硬盘类的对象
            Storage storage = new Storage();
            storage.Name = "机械硬盘";
            storage.Rom = 1024;
            storage.writeStorage();
            Console.ReadKey();
        }
    }
}
