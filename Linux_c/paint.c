/*paint.c -- 使用条件运算符*/
#include<stdio.h>
#define COVERAGE 200 /*每罐漆可喷平方英尺数*/
int main(void)
{
	int sq_feet;
	int cans;
	
	printf("输入要画的平方英尺数:\n");
	while(scanf("%d",&sq_feet)==1)
	{
		cans=sq_feet / COVERAGE;
		cans+=((sq_feet % COVERAGE==0))?0:1;
		printf("你需要%d %s 的涂料.\n",cans,cans==1?"can":"cans");
		printf("确认下一个值(输入q则退出):\n");
	}
	return 0;
}
