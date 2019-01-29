using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _06字符串的各种方法
{
    class Program
    {
        static void Main(string[] args)
        {
            ////练习1:随机输入你心中想要的一个名字,然后输入它的长度 length:可以获得字符串长度
            ////Console.WriteLine("随机输入你心中想要的一个名字");
            ////string s1 = Console.ReadLine();
            ////Console.WriteLine("你心中想得名字的长度是{0}", s1.Length);
            ////Console.ReadKey();

            //Console.WriteLine("请输入你喜欢的课程");
            //string lessonOne = Console.ReadLine();
            ////将字符串转换成大写
            ////lessonOne = lessonOne.ToUpper();

            ////将字符串转换为小写
            ////lessonOne = lessonOne.ToLower();
            //Console.WriteLine("请输入你喜欢的课程");
            //string lessonTwo = Console.ReadLine();
            ////将字符串转换为大写
            ////lessonTwo = lessonTwo.ToUpper();

            ////将字符串转换为小写
            ////lessonTwo = lessonTwo.ToLower();
            //if (lessonOne.Equals(lessonTwo,StringComparison.OrdinalIgnoreCase))
            //{
            //    Console.WriteLine("你们俩喜欢的课程相同");
            //}
            //else
            //{
            //    Console.WriteLine("你们俩喜欢的课程不同");
            //}
            //Console.ReadKey();

            //string s = "a b    d _ / = - + fgk";
            ////分割字符串Split
            //char[] chs = { ' ', '_', '/', '=', '-', '+' };
            //string[] str = s.Split(chs, StringSplitOptions.RemoveEmptyEntries);
            //Console.ReadKey();

            //练习:从日期字符串("2008-08-08")中分析出年,月,日;2008年08月08日.
            //让用书输入一个日期格式如:2008-01-02,你输出你输入的日期为2008年1月2日
            //string s = "2008-2-2";
            //char[] chs = { '-' };
            ////string[] date = s.Split(new char[] { '-' }, StringSplitOptions.RemoveEmptyEntries);
            //string[] date = s.Split(chs, StringSplitOptions.RemoveEmptyEntries);
            //Console.WriteLine("{0}年{1}月{2}日", date[0], date[1], date[2]);
            //Console.ReadKey();

            //string str = "国家主席:胡锦涛";
            //if (str.Contains("胡锦涛"))
            //{
            //    str = str.Replace("胡锦涛", "233");
            //}
            //Console.WriteLine(str);
            //Console.ReadKey();

            //Substring 截取字符串
            //string str = "今天天气好晴朗,处处好风光";
            //str = str.Substring(1, 2);
            //Console.WriteLine(str);
            //Console.ReadKey();

            //SartWith()开始字符串
            //EndsWith()结束字符串
            //string str = "今天天气好晴朗,处处好风光";
            //if (str.EndsWith("风光"))
            //{
            //    Console.WriteLine("正确");
            //}
            //else
            //{
            //    Console.WriteLine("错误");
            //}
            //Console.ReadKey();

            //找出指定字符第一次出现的位置,包括当前指定的位置
            //string str = "今天天气好晴朗, 处处好风光";
            //int index = str.IndexOf('处',10);
            //Console.WriteLine(index);
            //Console.ReadKey();

            //找出指定字符串最后一次出现的位置,包括当前指定的位置
            //string str = "今天天气好晴朗, 处处好风光";
            //int index = str.LastIndexOf('处');
            //Console.WriteLine(index);
            //Console.ReadKey();

            //LastIndexOf Substring 查找文件并截取文件名
            //string path =@"E:\Myself\wallpaper\酷炫动漫萌妹子p站画师_&_dc2762f2-d764-4a10-b0ca-cdbd490ced83.jpg";
            //int index = path.LastIndexOf('\\');
            //path = path.Substring(index+1);
            //Console.WriteLine(path);
            //Console.ReadKey();

            //string str = "      hahahahah        ";
            ////str = str.Trim();     //删除字符串两端的空格
            ////str = str.TrimStart();    //删除字符串前端空格
            ////str = str.TrimEnd();      //删除字符串后端空格
            //Console.Write(str);
            //Console.ReadKey();

            //判断字符串是否为空或为Null
            //string str = null;
            //string str = "";
            //string str = "2333";
            //if (string.IsNullOrEmpty(str))
            //{
            //    Console.WriteLine("是的");
            //}
            //else
            //{
            //    Console.WriteLine("不是");
            //}
            //Console.ReadKey();

            //在字符串数组中加入分割符
            string[] names = { "小羊", "李嘎", "井噶" };
            //string strNames = string.Join("|",names);
            string strNames = string.Join("|", "小羊", "李嘎", "井噶");
            Console.WriteLine(strNames);
            Console.ReadKey();

        }
    }
}
