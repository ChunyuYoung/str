#include<stdio.h>
int main(void)
{
	long long a,b,c;  //�ӷ�
	long long d,e,f;  //����
	long long g,h,i;  //�˷�
	long long j,k,l;  //����
	long long m,n,o;  //��ģ

	printf("�ӷ� ��ȡ��һ��ֵ\n");
	scanf_s("%ll",&a);
	printf("��ȡ�ڶ���ֵ\n");
	scanf_s("%ll",&b);
	c=a+b;
	printf("�ӷ� ������Ϊ%ll\n",c);

	printf("���� ��ȡ��һ��ֵ\n");
	scanf_s("%ll",&d);
	printf("��ȡ�ڶ���ֵ\n");
	scanf_s("%ll",&e);
	f=d-e;
	printf("���� ������Ϊ%ll\n",f);

	printf("�˷� ��ȡ��һ��ֵ\n");
	scanf_s("%ll",&g);
	printf("��ȡ�ڶ���ֵ\n");
	scanf_s("%ll",&h);
	i=g*h;
	printf("�˷� ������Ϊ%ll\n",i);

	printf("���� ��ȡ��һ��ֵ\n");
	scanf_s("%ll",&j);
	printf("��ȡ�ڶ���ֵ\n");
	scanf_s("%ll",&k);
	l=j/k;
	printf("���� ������Ϊ%ll\n",l);

	printf("��ģ ��ȡ��һ��ֵ\n");
	scanf_s("%ll",&m);
	printf("��ȡ�ڶ���ֵ\n");
	scanf_s("%ll",&n);
	o=m%n;
	printf("��ģ ������Ϊ%ll\n",o);

	return 0;
}
