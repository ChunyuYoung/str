#include<stdio.h>
int main(void)
{
	int a;
	printf("请做出判断\n");
	scanf("%d",&a);
	if(a!=0)
	{
		printf("您输入的值大于0\n");    //如果真则执行这一行
	}
	else  //反之，则执行这一行
		printf("这可能是_如果。。。则_的语句形式 -- 易语言\n");
	return 0;

}
