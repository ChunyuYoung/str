#include<stdio.h>
int main(void)
{
	float a,b;
	printf("请输入您的身高\n");
	scanf("%f",&b);
	a=2.54;
	b=b*a;
	printf("\n您的身高为%f英寸",b);
	return 0;
}