#include<stdio.h>
int main(void)
{
	printf("���ڲ�ѯСϵͳ!\n");
	int weekday;
	scanf("%d",&weekday);
	switch(weekday<8 && weekday>0)
		{
			case 1:
			printf("����������һ!\n");
			break;
			
			case 2:
			printf("���������ڶ�!\n!");
			break;
			
			case 3:
			printf("������������!\n");
			break;
			
			case 4:
			printf("������������!\n");
			break;
			
			case 5:
			printf("������������!\n");
			break;
			
			case 6:
			printf("������������!\n");
			break;
			
			case 7:
			printf("������������!\n");
			break;
			
			default:
				printf("����:\n������1-7�⼸������!\n");
				break;
		}
	return 0;
}
