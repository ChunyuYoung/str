//power.c -- ������ֵ����������
#include<stdio.h>
double power(double n,int p); //ANSIԭ��
int main(void)
{
	double x,xpow;
	int exp;
	
	printf("����һ�����ֺ�����������");
	printf("��\n������־ͻ���������q");
	printf("���˳���\n");
	while(scanf("%lf%d",&x,&exp)==2)
	{
		xpow=power(x,exp);  //��������
		printf("%.3g����Դ��%d��%.5g\n",x,exp,xpow);
		printf("ȷ����һ�����ֻ�q�˳���\n"); 
	 } 
	 printf("ϣ�����������Ȩ��֮��--�ټ�\n");
	 return 0;
 } 
 double power(double n,int p)  //�������� 
 {
 	double pow =1;
 	int i;
 	
 	for(i=1;i<=p;i++)
 		pow *=n;
 	return pow;
 }
