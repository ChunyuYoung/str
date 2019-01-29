/*pizza.c -- 在这个比萨饼的例子中使用定义常量*/
#include<stdio.h>
#define PI 3.14159
int main(void)
{
	float area,circum,radius;
	printf("你的披萨饼半径是多少?\n");
	scanf("%f",&radius);
	area=PI*radius*radius;
	circum=2.0*PI*radius;
	printf("披萨的基本参数如下: \n");
	printf("circum=%1.2f,area=%1.2f\n",circum,area);
	return 0;
}
	