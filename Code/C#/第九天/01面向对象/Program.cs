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
            //病人记录
            _Health health = new _Health();
            health.Name = "StringOD";   //给_Health()类方法的静态字段赋值
            health.Health = "严重";       
            health.hlHealth();          //调用h1Health()在终端输出信息
            Console.ReadKey(false);     //按任意键结束时不在终端上输出字符
        }
    }
}
