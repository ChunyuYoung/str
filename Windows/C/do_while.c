/*do_while.c -- �˳�����ѭ��*/
/*do while�ض�ִ��һ�Σ�����ִ��һ��*/ 
#include<stdio.h>
int main(void)
{
	const int secret_code = 13;    
	int code_entered;              
	
	do
	{
		printf("������ֲ��ֲ�����13֤,\n");
		printf("��ѡ����������ִ���: ");
		scanf("%d,&code_entered");
	}
	while (code_entered != secret_code);
	printf("��ϲ�㣡���Ѿ�Ȭ���ˣ�\n");
	return 0;
 } 
