#include<stdio.h>
int main(void)
{
	int a[4][3]={{2,3,3},{5,2,1},{5,4,1},{2,2,2}};
	int b=0,c=0;
	for(b=0;b<4;b++)
	{
		printf("��:%d",a[b][c]);	//������һ�н�����ӡ��
		for(c=0;c<4;c++) 
		{
			printf("��:%d",a[b][c]);
		}
		printf("\n");
	}
	//printf("1�е�һ��:%d\n1�еڶ���:%d\n1�е�����:%d\n",a[1][1],a[1][2],a[1][3]);
	return 0;
}
