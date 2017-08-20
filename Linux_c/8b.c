#include<stdio.h>
int main(void)
{
	char ch;
	scanf("%c",&ch);  //输入一个字符
	while(ch!='g')
	{
		printf("%c",++ch);  //给输入的字符加1
		scanf("%c",&ch);
	}
	return 0;
}
