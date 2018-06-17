#include<stdio.h>
int main(void)
{
	printf("                                                  欢迎使用极客方式学习手册\n");
	char ch;
	scanf("%c",&ch);
	if(ch=='shitianrui')
	{
		printf("成功登陆→极客方式学习手册!\n感谢您的支持!\n");
	}
	else
		printf("抱歉,密码错误!程序将退出!\n"); 

	
	return 0; 
}
