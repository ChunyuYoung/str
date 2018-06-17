/*praisel.c--使用不同类型的字符串*/
#include<stdio.h>
#define PRAISE "好一个超级神奇的名字!"
int main(void)
{
	char name[40];
	printf("你的名字是什么?\n");
	scanf("%s",name);
	printf("你好,%s.%s\n",name,PRAISE);
	return 0;
}