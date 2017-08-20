//getchar()获取一个字符，putchar()输出一个字符
#include<stdio.h>
int main(void)
{
	printf("开始获取字符\n");
	char ch;
	ch=getchar();   //getchar()没有参数
	printf("验证输入的字符\n");
	putchar(ch);   //打印输出的一个字符有参数，输出字符变量
	printf("\n");
	return 0;

}
