#include<stdio.h>
int main(void)
{
	float a,b;
	printf("请键入一个值将被输出位立方倍\n");
	scanf("%f",&a);
	b=a*a*a;
	printf("转换为立方倍的值为%f\n",b);
	return 0;
}