#include<stdio.h>
#define A +3.785
#define B +1.609
int main(void)
{
	float c,d;
	printf("请输入行驶的英里数和消耗汽油的升数\n");
	scanf("%f%f",&c,&d);
	printf("英里除以汽油升数:%.1f\n",c/d);
	printf("100公里:%.1f\n",d*A/(100*c));
	return 0;
}