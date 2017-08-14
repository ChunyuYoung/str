#include<stdio.h>
#define value 10
int main(void)
{
	int a,b;
	int number[value];
	printf("开始获取整数数组\n");
	for(a=0;a<10;a++)
	{	
		scanf("%d",&number[value]);
	}
	printf("开始验证输入的数组\n");
	for(b=0;b<10;b++)
	{
		printf("%d",number[value]);
		printf("\n");
	}
	printf("终于成功了\n");
return 0;
}
