//目前程序还存在BUG正在修复
#include<stdio.h>
int main(void)
{
	//int bin;	//定义一个二进制变量
	int otc=0;	//定义一个八进制变量
	int hex=0;	//定义一个十六进制变量
	int dec=0;	//定义一个十进制变量
	int value;	//定义一个整数型变量
	char ch;	//定义一个字符型变量

	printf("我们对程序定义了四个变量!\n分别是→二进制-八进制-十六进制-十进制\n");
	printf("\n");
	printf("下面请按照程序提示一步一步输入→目前程序仅仅支持整数←\n");

	printf("请输入对应的字符串:bin=十进制 otc=八进制 hex=十六进制 dec=十进制\n");
	while (scanf("%c", &ch) != ' ')
	{
		if (scanf("%c", &ch) == otc)
		{
			printf("请输入八进制数:");
			scanf("%d", &value);
			otc = value;
			printf("转换的八进制数:%#o", otc);
		}
		else if (scanf("%c", &ch) == hex)
		{
			printf("请输入十六进制数:");
			scanf("%d", &value);
			hex = value;
			printf("转换的十六进制数:%#h", hex);
		}
		else if (scanf("%c", &ch) == dec)
		{
			printf("请输入十进制数:");
			scanf("%d", &value);
			dec = value;
			printf("转换的十进制数:%#d", dec);
		}
		else
			printf("错误提示:\n请输入正确的格式!");
	}
	return 0;
}