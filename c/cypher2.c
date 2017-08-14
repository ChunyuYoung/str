/*cypher2.c -- 改变输入，只保留非字母字符*/
#include<stdio.h>
#include<ctype.h>  //为isalpha()提供原型
int main(void)
{
	char ch;
	
	while((ch=getchar())!='\n')
	{
		if(isalpha(ch))  //如果是一个字母
			putchar(ch+1);  //则改变它
		else  //否则
			putchar(ch);  //打印原来值
	}
	putchar(ch);  //打印换行符
	return 0;
}
