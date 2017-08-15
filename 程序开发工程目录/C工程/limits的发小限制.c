#include<stdio.h>
#include<limits.h>
#include<float.h>
#define INT_MAX  +32767
#define INT_MIN   -32768
int main(void)
{
	printf("最大值%d\n最小值%d\n",INT_MAX,INT_MIN);
	printf("short类型最大值%d\n",SHRT_MAX);
	printf("float类型正数的最大值%d\n",FLT_MAX);
	printf("char的位数%d\n",CHAR_BIT);
	printf("float的尾位数%d\n",FLT_MANT_DIG);
	return 0;
}