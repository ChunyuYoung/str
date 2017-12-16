#include<stdio.h>
int main(void)
{
	float a,b,c;
	printf("计算结果采用Float数据类型\n");
	
	printf("输入第一个除数\n");
	scanf("%f",&b);
	printf("输入第二个被除数\n");
	scanf("%f",&c);
	a=b/c;
	printf("除法计算结果输出:");
	printf("%f",a);
	return 0;
}