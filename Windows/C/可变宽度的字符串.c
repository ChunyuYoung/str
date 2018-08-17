#include<stdio.h>
int main(void)
{
	int a,b,c;
	b=256;
	printf("字段宽度是什么\n");
	scanf("%d",&a);
	printf("输出字段宽度%*d",a,b);
	return 0;
}