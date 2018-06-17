//为什么大于循环条件还能打印？
#include<stdio.h>
int main(void)
{
	char ch='s';
	while(ch<'w')
	{
	   printf("%c",ch);
	   ch++;
	}
	return 0;
}