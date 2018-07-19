using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _08数组的5个练习
{
    class Program
    {
        static void Main(string[] args)
        {
            #region 练习1:比较数组中的元素最大值和最小值
            ////练习1:从一个整数数组中取出最大的整数,最小整数,总和,平均值
            ////声明一个int类型的数组 并且随意的赋初值
            //int[] nums =  { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
            ////声明两个变量用来存储最大值和最小值
            //int max = int.MinValue;//nums[0];  //如果赋值在要比较中的值没有可能会得到和目的不同的结果
            //int min = int.MaxValue;//nums[0];  //这样可以保证要比较的值是在这个数组中

            //int num=0, advage=0;
            ////循环的让数组中的每个元素和最大值,最小值做比较
            //for (int i = 0; i < nums.Length; i++)
            //{
            //    //关于在循环中nums[i]的理解方式
            //    //1.代表数组中当前循环的元素
            //    //2.代表数组中的每个元素
            //    //如果数组中当前循环到的这个元素,比max大,把这个元素赋值给max
            //    //如果数组中当前玄幻到的这个元素,比min小,把这个元素赋值给min
            //    if (nums[i] > max)
            //    {
            //        max = nums[i];
            //    }
            //    if (nums[i] < min)
            //    {
            //        min = nums[i];
            //    }
            //    num += nums[i];
            //    advage = num / nums.Length;
            //}
            //Console.WriteLine("最大值是:{0}\n最小值是:{1}\n总和是:{2}\n平均值是:{3}", max, min, num, advage);
            //Console.ReadKey(); 
            #endregion

            #region 练习2:计算一个整数数组的所有元素的和
            ////练习2:计算一个整数数组的所有元素的和
            //int[] num = { 1, 2, 3, 4, 5, 6, 7, 8 };
            //int nums=0;
            //for (int i = 0; i < num.Length; i++)
            //{
            //    nums += num[i];
            //}
            //Console.WriteLine(nums);
            //Console.ReadKey(); 
            #endregion

            #region 字符串数组输出分割
            ////练习3:数组里面都是人的名字,分割成(例如):老杨|老苏|老鼠...(老杨,老苏,老鼠,老虎,老牛,老蒋,老王,老马)
            //string[] name = { "老杨", "老苏", "老鼠", "老虎", "老牛", "老蒋", "老王", "老马" };
            //for (int i = 0; i < name.Length; i++)
            //{
            //    Console.Write(name[i]);
            //    Console.Write("|");
            //}
            //Console.ReadKey(); 
            #endregion

            #region 对正数组和负数组进行计算
            ////练习4:将一个整数数组的每一个元素进行如下处理:
            ////如果元素是正数则将这个位置的元素的值加1
            ////如果元素是负数则将这个位置的元素的值减1
            ////如果元素是0,则不变
            //int[] integer = { 1, -2, 3, -4, 5, -6 };
            //for (int i = 0; i < integer.Length; i++)
            //{
            //    if (integer[i]>0)
            //    {
            //        integer[i] += 1;
            //    }
            //    if (integer[i]<0)
            //    {
            //        integer[i] -= 1;
            //    }
            //    if (integer[i] == 0)
            //    {

            //    }
            //    Console.WriteLine(integer[i]);
            //}
            //Console.ReadKey(); 
            #endregion

            //练习5:将一个字符串数组的元素的顺序进行反转.
            //{"我","是","好","人"}{"好人","是","我"}.
            //的i个和第length-i-1个进行交换
            #region 字符串数组元素位置调换
            //适合与任意4个字符 / 字符串 / 数字组
            //例如: 1234-- > 4321这是横行打印效果
            //支持竖行打印效果:
            //1
            //2
            //3
            //4
            //倒序输出为:
            //4
            //3
            //2
            //1
            //后面两个字符调换位置倒序输出:
            //34
            //2
            //1
            string[] str = { "我", "是", "好", "人" };
            bool b = true;
            for (int i = 0; i < str.Length / 2; i++)
            {
                string strChar = str[i];
                str[i] = str[str.Length - 1 - i];
                str[str.Length - 1 - i] = strChar;
            }
            for (int i = 0; i < str.Length; i++)
            {
                Console.WriteLine(str[i]);
            }
            Console.WriteLine();
            for (int i = 0; i < str.Length / 2; i++)
            {
                if (i != 3 && i == 1)
                {
                    Console.WriteLine(str[i + 1]+"0");
                    b = false;
                }
                if (b)
                {
                    if (i != 3)
                    {
                        Console.Write(str[i + 1] + "0");
                    }
                }
                if (i != 1)
                {
                    Console.WriteLine(str[i] + "0101");
                }
                if (i == 1)
                {
                    Console.WriteLine(str[str.Length -1]+"1");
                }
            }
            Console.WriteLine("\n程序结束!");
            Console.ReadKey();
            #endregion
            //string[] names = { "我", "是", "好人" };
            #region 将数组元素按顺序颠倒位置
            //string[] names= { "a", "b", "c", "d", "e", "e", "f", "g" };
            //for (int i = 0; i < names.Length / 2; i++)  //循环次数为总长度/2,因为交换数组元素是两个两个交换所以要/2
            //{
            //    string temp = names[i];                 //声明temp为第三方变量
            //    names[i] = names[names.Length - 1 - i]; //凡是这种半天解决不了的题可以画图来理解一下思路
            //    names[names.Length - 1 - i] = temp;
            //}
            //for (int i = 0; i < names.Length; i++)
            //{
            //    Console.WriteLine(names[i]);            //当数组元素呗重新调整位置之后打印他们的元素
            //}
            //Console.ReadKey(); 
            #endregion
        }
    }
}
