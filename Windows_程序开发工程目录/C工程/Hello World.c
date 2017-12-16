#include<stdio.h>
int main(void)
{
	int a;
	char ch[]={'H','e','l','l','o',' ','W','o','r','l','d','!'};
	printf("Hello World!\n");
	printf("开始打印字符数组:");
	for(a=0;a<12;a++)
	printf("%c",ch[a]);
	return 0;
}
 
