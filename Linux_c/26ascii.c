#include<stdio.h>
#define ASCII 26
int main(void)
{
	char ch[ASCII];
	int num;
	for(num=0;num<26;num++)
	{
		printf("获取26个字符数组\n");
		scanf("%c",&ch[ASCII]);
	}
	printf("开始验证获取的数组\n");
	printf("%c",ch[ASCII]);
	
	return 0;
	
}
