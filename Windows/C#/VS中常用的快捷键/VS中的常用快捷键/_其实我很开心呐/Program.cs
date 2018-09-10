using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _其实我很开心呐
{
    class Program
    {
        static void Main(string[] args)
        {
            //场景绘制
            Console.ForegroundColor = ConsoleColor.Cyan;
            Console.WriteLine("--> 你坐在草坪上发呆");
            Console.WriteLine("--> 在你身后过来了一个女孩,她拿着一大袋零食");
            Console.WriteLine("女孩: 嗨,你好");
            Console.WriteLine("你: 呃...");
            Console.WriteLine("你: 你是在...和我说话吗?");
            Console.WriteLine("女孩: 噗~,不然嘞");
            Console.WriteLine();

            //场景与剧情分割线
            for (int i = 0; i < 30; i++)
            {
                Console.Write("-");
            }
            Console.WriteLine();

            //剧情开始
            Console.ForegroundColor = ConsoleColor.Yellow;
            Console.Write("女孩:我给你买了很多点心,一起来吃吧");
            Console.WriteLine();

            Console.WriteLine();
            Console.WriteLine();
            //内心状态_彩虹_红色
            for (int j = 0; j < 72; j++)
            {
                Console.ForegroundColor = ConsoleColor.Red;
                Console.Write("~");
                if (j == 30)
                {
                    Console.Write("此时此刻的内心状态");
                }
            }
            Console.WriteLine();

            //内心状态_彩虹_绿色
            for (int k = 0; k < 72; k++)
            {
                Console.ForegroundColor = ConsoleColor.Green;
                Console.Write("~");
                if (k == 30)
                {
                    Console.Write("此时此刻的内心状态");
                }
            }
            Console.WriteLine();

            //内心状态_彩虹_紫红色
            for (int l = 0; l < 72; l++)
            {
                Console.ForegroundColor = ConsoleColor.Magenta;
                Console.Write("~");
                if (l == 30)
                {
                    Console.Write("此时此刻的内心状态");
                }
            }
            Console.WriteLine();

            //内心状态_彩虹_青色
            for (int m = 0; m < 72; m++)
            {
                Console.ForegroundColor = ConsoleColor.Cyan;
                Console.Write("~");
                if (m == 30)
                {
                    Console.Write("此时此刻的内心状态");
                }
            }
            Console.WriteLine();

            //内心状态_彩虹_红色
            for (int n = 0; n < 72; n++)
            {
                Console.ForegroundColor = ConsoleColor.Red;
                Console.Write("~");
                if (n == 30)
                {
                    Console.Write("此时此刻的内心状态");
                }
            }
            Console.WriteLine();

            //内心状态_彩虹_绿色
            for (int o = 0; o < 72; o++)
            {
                Console.ForegroundColor = ConsoleColor.Green;
                Console.Write("~");
                if (o == 30)
                {
                    Console.Write("此时此刻的内心状态");
                }
            }
            Console.WriteLine();

            //内心状态_彩虹_紫红色
            for (int p = 0; p < 72; p++)
            {
                Console.ForegroundColor = ConsoleColor.Magenta;
                Console.Write("~");
                if (p == 30)
                {
                    Console.Write("此时此刻的内心状态");
                }
            }
            Console.WriteLine();

            //内心状态_彩虹_青色
            for (int q = 0; q < 72; q++)
            {
                Console.ForegroundColor = ConsoleColor.Cyan;
                Console.Write("~");
                if (q == 30)
                {
                    Console.Write("此时此刻的内心状态");
                }
            }
            Console.WriteLine();
            Console.WriteLine();

            //选项卡
            Console.ForegroundColor = ConsoleColor.White;
            Console.WriteLine("选项卡--> A:嗯,好!     B:emmmmm,不了");

            //获取输入并控制输出/输入为A/B
            Console.WriteLine();
            Console.ForegroundColor = ConsoleColor.White;
            string ch = Console.ReadLine();
            string s = Program._Eat(ch);
            Console.ForegroundColor = ConsoleColor.Green;
            Console.WriteLine("{0}",s);
            Console.WriteLine();

            Console.ForegroundColor = ConsoleColor.Magenta;
            Console.WriteLine("女孩:え～～～～～～～,难得人家还买了好多呢");
            Console.WriteLine("女孩:好可惜啊!");
            Console.WriteLine("女孩:那好吧!");
            Console.WriteLine("(女孩走了)");

            Console.WriteLine();
            Console.ForegroundColor = ConsoleColor.Green;
            Console.WriteLine("你:其实我很开心呐!");
            Console.WriteLine("你: 谢谢你");

            //剧情/游戏结束
            Console.ForegroundColor = ConsoleColor.Red;
            Console.WriteLine();
            Console.WriteLine("游戏结束");
            Console.ReadKey();
        }
        /// <summary>
        /// 判断输入的是否为A或B
        /// </summary>
        /// <param name="s">字符串</param>
        /// <returns>返回一个A或B</returns>
        public static string _Eat(string s)
        {
            while (s != "A" && s != "B")
            {
                //如果错误提示出现次数大于等于2时提醒用户不在进行非法操作
                Console.ForegroundColor = ConsoleColor.DarkRed;
                int i = 0;
                i++;
                switch(i)
                {
                    case 2:
                    case 3:
                        Console.WriteLine("--> 这是剧情任务,你不能这样做");
                        break;
                    default:Console.WriteLine("--> 捣乱可是坏孩子哦");
                        break;
                }

                //如果输入不是"A"或"B"则报错
                Console.WriteLine("错误: 请输入A/B");
                s = Console.ReadLine();
            }
            
            if (s == "A")
            {
                Console.ForegroundColor = ConsoleColor.DarkGreen;
                Console.WriteLine(@"你(思考了一下)_(你想吃,但是你没有说出口)");
                return s = "你: emmmmmm,我...不了吧";
            }
            else if (s == "B")
            {
                return s = "你: emmmm,谢谢,我不想吃";
            }
            return s;
        }
    }
}