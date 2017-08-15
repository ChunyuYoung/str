//转换分钟为秒数
#include<stdio.h>
#define S_TO_M 60
int main(void)
{
	int sec,min,left;
	printf("这个程序转换秒数和分钟");
	printf("秒数.\n");
	printf("必须确认数字和秒数.\n");
	printf("确认小于0结束程序.\n");
	while (sec>0)
	{
		scanf("%d",&sec);
		min=sec / S_TO_M;
		left=sec % S_TO_M;
		printf("%d 秒数是 %d 分钟,%d 秒数.\n",sec,min,left);
	}
	return 0;
}