#include<stdio.h>

int main(void)
{
	char word;
	int number;

	
	printf("��ѡ����ϲ���ļ��ܷ�ʽ\n");
	printf("�����ּ���:y\n���ַ�������:n\n");
	printf("��ʼ��֤:\b\n");
	scanf("%c",&word);
	
	while(word=='y')
	{
		printf("��ӭʹ�����ּ��ܷ�ʽ\n");
		scanf("%d",&number);
		printf("�˽���(OCT)���ܽ��:%#o\n",number);
		printf("ʮ������(HEX)���ܽ��:%#x\n",number);
		printf("��֤ԭַ(DEC):%#d\n\n",number);
    	
    	printf("�ж�����ѭ��\n");
    	
		printf("%d\n",word); 
	}
	printf("Successful");
	return 0;
 } 

