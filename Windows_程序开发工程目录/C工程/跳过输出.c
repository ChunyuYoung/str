#include<stdio.h>
int main(void)
{
	int n;
	
	printf("请确认输入三个整数: \n");
	scanf("%*d %*d %d",&n);
	printf("打印最后一个整数:%d\n",n);
	return 0;
}