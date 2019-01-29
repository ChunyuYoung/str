#include<stdio.h>
int main(void)
{
	float a,b;
	a=950;
	printf("请输入有多少跨脱水\n");
	scanf("%f",&a);
	b=a*(950*3e-23);
	printf("\n这么多的跨脱水中包含%e多个水分子",b);
	return 0;
}