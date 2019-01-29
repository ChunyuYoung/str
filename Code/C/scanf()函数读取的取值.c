#include<stdio.h>
int main(void)
{
	char a[40];
	printf("如果再输入中有特殊符号将会停止读取\n");
	scanf("%s",&a);
	printf("%s",a);
	return 0;
}