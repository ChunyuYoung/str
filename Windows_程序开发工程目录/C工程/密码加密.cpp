#include<stdio.h>
void zifuchuan(char y);
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
    	
    	zifuchuan(char n);
	}
	printf("Successful");
	return 0;
 } 
 void zifuchuan(char y)
 {
 	char type;
 	printf("��ӭʹ���ַ������ܷ�ʽ\n");
 	scanf("%c",&type);
 	while(type=='y')
 	{
 		printf("��������Ҫ���ܵ��ַ���\n�ո񾭳����ж�Ϊ�Ƿ��ַ�\n");
 		scanf("%c",&type);
 		printf("�˽���(OCT)\n:%#o",type);
 		printf("ʮ������(HEX)\n:%#x",type);
 		printf("��֤ԭַ(DEC)\n",type);
 		
 		printf("�ж��˳�ѭ��\n");
 		scanf("%c",&type);
	 }
 }
