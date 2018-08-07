using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _07高级参数
{
    class Program
    {
        static void Main(string[] args)
        {
            //写一个方法,求一个数组中的最大值,最小值,总和,平均值
            int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
            int[] res = intMaxMinNumAvg(numbers);
            Console.WriteLine("最大值是:{0},最小值是:{1},总和是:{2},平均值是:{3}", res[0], res[1], res[2], res[3]);
            Console.ReadKey();
        }
        /// <summary>
        /// 计算一个数组的最大值,最小值,总和,平均值
        /// </summary>
        /// <param name="nums">要返回的数组</param>
        /// <returns></returns>
        public static int[] intMaxMinNumAvg(int[] nums)
        {
            int[] res = new int[4];
            //假设res[0]最大值 res[1]最小值 res[2]总和 res[3]平均值
            res[0] = nums[0];
            res[1] = nums[0];
            res[2] = 0;
            for (int i = 0; i < nums.Length; i++)
            {
                if (nums[i]> res[0])
                {
                    res[0] = nums[i];
                }
                if (nums[i]< res[1])
                {
                    res[1] = nums[i];
                }
                res[2] += nums[i];
            }
            res[3] = res[2] / nums.Length;
            return res;
        }
    }
}
