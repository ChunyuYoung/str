#include<stdio.h>
int main(void)
{
	int *p;
	int a;
	printf("����һ�������͵ĵ�ַ:");
	scanf("%d",&a);
	printf("a��ֵΪ��%d\nȡa��ַ:%p\nȡa��ʮ����ֵ��%d\nȡa��ֵ��ʮ�����ƣ�%p",a,&p,p=a,p=a);	//%d_p=a��ֵ���� ,%p_p=a��ֵΪʮ������ 
	return 0;
}
