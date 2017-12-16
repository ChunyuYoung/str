#include<stdio.h>
int main(void)
{
	char a[10];
	float b;
	scanf("%s%f",a,&b);
	printf("名字是%s,身高%.3f英寸",a,b);
	return 0;
}