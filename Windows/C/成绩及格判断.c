//ѧ���ɼ����ж�
#include<stdio.h>
int main(void)
{
	float score;
	printf("������ѧ���ĳɼ�!\n");
	scanf("%f",&score);
	if(score>=80 && score<=100)
	{
		printf("��ĳɼ�Ϊ����!\n");
	}
	else
	{
		if(score<=80 && score>=72)
		{
			printf("��ĳɼ�Ϊ����!\n"); 
		}
		else
		{
			printf("��ĳɼ�������!\n"); 
		 } 
	}
	return 0;
 } 
