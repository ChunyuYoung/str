#include<stdio.h>

int main(void)
{
	char word;
	int number;

	
	printf("请选择您喜欢的加密方式\n");
	printf("①数字加密:y\n②字符串加密:n\n");
	printf("开始验证:\b\n");
	scanf("%c",&word);
	
	while(word=='y')
	{
		printf("欢迎使用数字加密方式\n");
		scanf("%d",&number);
		printf("八进制(OCT)加密结果:%#o\n",number);
		printf("十六进制(HEX)加密结果:%#x\n",number);
		printf("验证原址(DEC):%#d\n\n",number);
    	
    	printf("判断条件循环\n");
    	
		printf("%d\n",word); 
	}
	printf("Successful");
	return 0;
 } 

