#include<stdio.h>
void zifuchuan(char y);
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
    	
    	zifuchuan(char n);
	}
	printf("Successful");
	return 0;
 } 
 void zifuchuan(char y)
 {
 	char type;
 	printf("欢迎使用字符串加密方式\n");
 	scanf("%c",&type);
 	while(type=='y')
 	{
 		printf("请输入您要加密的字符串\n空格经常被判定为非法字符\n");
 		scanf("%c",&type);
 		printf("八进制(OCT)\n:%#o",type);
 		printf("十六进制(HEX)\n:%#x",type);
 		printf("验证原址(DEC)\n",type);
 		
 		printf("判断退出循环\n");
 		scanf("%c",&type);
	 }
 }
