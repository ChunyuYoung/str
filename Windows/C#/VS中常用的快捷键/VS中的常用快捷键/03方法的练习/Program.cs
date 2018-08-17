using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _03方法的练习
{
    class Program
    {
        static void Main(string[] args)
        {
            #region 第100题
            //100.计算任意多个数间的最大值(提示:params)
            //int sum = numMax(1, 2, 3, 4, 5, 6);
            //Console.WriteLine(Program.numMax(sum));
            //Console.ReadKey(); 
            #endregion
            #region 第101题
            //101.请通过冒泡排序法对整数数组{1,3,5,7,90,2,4,6,8,10}实现升序排列
            //int[] nums = { 1, 3, 5, 7, 90, 2, 4, 6, 8, 10 };
            //Program.Number(nums);
            //for (int i = 0; i < nums.Length; i++)
            //{
            //    Console.WriteLine(nums[i]);
            //}
            //Console.ReadKey(); 
            #endregion
            //102.将一个字符串数组输出为|分割的形式,比如"梅西|卡卡西|西红柿"(用方法来实现)
            string[] names = { "梅西", "卡卡西", "西红柿" };
            string s= Program.Names(names);
            Console.WriteLine(s);
            Console.ReadKey();
        }
        public static string Names(string[] names)
        {
            string strNames = null;
            for (int i = 0; i < names.Length - 1; i++)
            {
                strNames += names[i] + "|";
            }
            return strNames + names[names.Length - 1];
        }
        /// <summary>
        /// 数组冒泡排序
        /// </summary>
        /// <param name="nums">数组</param>
        public static void Number(int[] nums)
        {
            //int max = nums[0];
            for (int i = 0; i < nums.Length -1; i++)
            {
                for (int j = 0; j < nums.Length -1 -i; j++)
                {
                    if (nums[j]>nums[j+1])
                    {
                        int temp = nums[j];
                        nums[j] = nums[j + 1];
                        nums[j + 1] = temp;
                    }
                }
            }
        }
        /// <summary>
        /// 计算数组中的最大值
        /// </summary>
        /// <param name="max">最大值</param>
        /// <returns>返回最大值</returns>
        public static int numMax(params int[] max)
        {
            int maxValue = 0;
            for (int i = 0; i < max.Length; i++)
            {
                if (maxValue<max[i])
                {
                    maxValue = max[i];
                }
            }
            return maxValue;
        }
    }
}
