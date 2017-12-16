#include<stdio.h>
int main(void)
{
  float a;	printf("你可以尝试这输入一个浮点数\n");
	scanf("%f",&a);
	
	printf("将要输出一个整数\n");
	printf("%.1f\n",a);
	printf("不能误导编译器否则会出错,容易出现错误或者函数溢出");
	return 0;
}