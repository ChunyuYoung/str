//Ŀǰ���򻹴���BUG�����޸�
#include<stdio.h>
int main(void)
{
	//int bin;	//����һ�������Ʊ���
	int otc=0;	//����һ���˽��Ʊ���
	int hex=0;	//����һ��ʮ�����Ʊ���
	int dec=0;	//����һ��ʮ���Ʊ���
	int value;	//����һ�������ͱ���
	char ch;	//����һ���ַ��ͱ���

	printf("���ǶԳ��������ĸ�����!\n�ֱ��ǡ�������-�˽���-ʮ������-ʮ����\n");
	printf("\n");
	printf("�����밴�ճ�����ʾһ��һ�������Ŀǰ�������֧��������\n");

	printf("�������Ӧ���ַ���:bin=ʮ���� otc=�˽��� hex=ʮ������ dec=ʮ����\n");
	while (scanf("%c", &ch) != ' ')
	{
		if (scanf("%c", &ch) == otc)
		{
			printf("������˽�����:");
			scanf("%d", &value);
			otc = value;
			printf("ת���İ˽�����:%#o", otc);
		}
		else if (scanf("%c", &ch) == hex)
		{
			printf("������ʮ��������:");
			scanf("%d", &value);
			hex = value;
			printf("ת����ʮ��������:%#h", hex);
		}
		else if (scanf("%c", &ch) == dec)
		{
			printf("������ʮ������:");
			scanf("%d", &value);
			dec = value;
			printf("ת����ʮ������:%#d", dec);
		}
		else
			printf("������ʾ:\n��������ȷ�ĸ�ʽ!");
	}
	return 0;
}