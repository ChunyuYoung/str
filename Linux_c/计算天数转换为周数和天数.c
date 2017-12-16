//计算天数转换为周数和天数
#include<stdio.h>
int main(void)
{
	int a,b,c;
	printf("获取天数\n");
	scanf("%d",&a);
	printf("\n开始计算…\n");
	b=a/7;
	c=a%7;
	printf("周数为%d周多%d天总共%d天\n",b,c,a);
	return 0;
}