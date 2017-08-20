#include<stdio.h>
int main(void)
{
	char ch;
	
	do{
	scanf("%c",&ch); //获取字符
	printf("%c",ch);  //验证输入的字符
	}while(ch!='g');  //判断当ch为g时条件为假并执行一次循环退出
	return 0;
}
