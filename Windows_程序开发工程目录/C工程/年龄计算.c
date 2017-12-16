#include<stdio.h>
int main(void)
{
	int a,b,c,e,f;
	printf("获取当前年份\n");
	scanf("%d",&a);
	printf("获取出生年份\n");
	scanf("%d",&b);
	printf("获取生日的月份\n");
	scanf("%d",&e);
	printf("获取生日的日期\n");
	scanf("%d",&f);
	c=a-b;
	printf("我的年龄是 %d 岁,生日是%d月 %d号\n",c,e,f);
	
	return 0;
}