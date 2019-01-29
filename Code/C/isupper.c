/*isupper() -- 转换大写字母*/
#include<stdio.h>
#include<ctype.h>
int main(void)
{
	char ch;	
	
	ch=getchar();
	printf("\n");
	isupper(ch);
	printf("\n");
	putchar(ch);
	printf("\n");
	return 0;
}
