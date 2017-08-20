#include<stdio.h>
int main(void)
{
	int bph2o=212;
	int rv;
	
	rv=printf("%d 水的沸点是212F\n ",bph2o);
	printf("printf()功能打印%d个字符\n",rv);
	return 0;
}