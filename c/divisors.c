//divisors.c -- 使用嵌套if显示一个数的约数
#include<stdio.h>
#include<stdbool.h>
int main(void)
{
	unsigned long num;  //要检查的书
	unsigned long div;  //可能的约数
	bool isPrime;  //素数的标志
	
	printf("请输入一个要分析的整数：");
	printf("输入q则退出。\n");
	while(scanf("%lu",&num)==1)
	{
		for(div=2,isPrime=true;(div*div)<=num;div++)
		{
			if(num%div==0)
			{
				if((div*div)!=num)
					printf("%lu可以被整除%lu和%lu。\n",num,div,num/div);
				else
					printf("%lu可以被整除%lu。\n",num,div);
				isPrime=false;  //不是一个素数
			}
		}
		if(isPrime)
			printf("%lu是主要的。\n",num);
		printf("请输入其他要分析的整数：");
		printf("输入q则退出.\n");
	}
	printf("再见。\n");
	return 0;
}
