#include<stdio.h>
int main(void)
{
	printf("星期查询小系统!\n");
	int weekday;
	scanf("%d",&weekday);
	switch(weekday<8 && weekday>0)
		{
			case 1:
			printf("今天是星期一!\n");
			break;
			
			case 2:
			printf("今天是星期二!\n!");
			break;
			
			case 3:
			printf("今天是星期三!\n");
			break;
			
			case 4:
			printf("今天是星期四!\n");
			break;
			
			case 5:
			printf("今天是星期五!\n");
			break;
			
			case 6:
			printf("今天是星期六!\n");
			break;
			
			case 7:
			printf("今天是星期天!\n");
			break;
			
			default:
				printf("错误:\n请输入1-7这几个数字!\n");
				break;
		}
	return 0;
}
