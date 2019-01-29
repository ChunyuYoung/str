using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _09冒泡排序
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] nums = { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };
            //Array.Sort(nums);   //只能对数组进行升序排列
            //Array.Reverse(nums);    //对数组进行倒序反转
            for (int i = 0; i < nums.Length; i++)   //循环9次
            {
                for (int j = 0; j < nums.Length - 1 - i; j++)   //让数组元素每次加1
                {
                    if (nums[j] > nums[j + 1])
                    {
                        int temp = nums[j];
                        nums[j] = nums[j + 1];
                        nums[j + 1] = temp;
                    }
                }
            }
            for (int i = 0; i < nums.Length; i++)
            {
                Console.WriteLine(nums[i]);
            }
            Console.ReadKey();
        }
    }
}
