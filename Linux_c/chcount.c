//chcount.c -- 使用逻辑与运算符
#include<stdio.h>
#define PERIOD '.'
int main(void)
{
	int ch;
	int charcount=0;
	
	while((ch=getchar())!=PERIOD)
	{
		if(ch!='"' && ch != '\'')
			charcount++;
	}
	printf("有%d个非引号的字符.\n",charcount);
	return 0;
}
