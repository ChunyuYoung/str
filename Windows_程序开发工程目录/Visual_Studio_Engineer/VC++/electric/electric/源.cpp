/*electric.c -- �����õ���Ŀ*/
#include<stdio.h>
#define RATE1 0.12589	//��һ��360kwh�ķ���
#define RATE2 0.17901	//��һ��320kwh�ķ���
#define RATE3 0.20971	//����680kwh�ķ���
#define BREAK1 360.0	//���ʵĵ�һ���ֽ��
#define BREAK2 680.0	//���ʵĵڶ����ֽ��
#define BASE1 (RATE1 * BREAK1)	//�õ�360kwh�ķ���
#define BASE2 (BASE1 + (RATE2*(BREAK2-BREAK1)))	//�õ�680kwh�ķ���
int main(void)
{
	double kwh;		//�õ�ǧ��ʱ��Сʱ��
	double bill;	//����
	printf("������ǧ��ʱ.\n");
	scanf("%lf", &kwh);		//%lf��double���͵�˵����
	if (kwh <= BREAK1)
		bill = RATE1*kwh;
	else if (kwh <= BREAK2)	//�õ�����360kwh��680kwh֮��ʱ
		bill = BASE1 + (RATE2*(kwh - BREAK2));		//�õ�������680kwh
	else
		bill = BASE2 + (RATE3*(kwh - BREAK2));
	printf("%lfǧ��ʱ��%1.2f.\n", kwh, bill);
	return 0;
}