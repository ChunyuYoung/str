#include<stdio.h>
int main(void)
{
	int a[4][3]={{2,3,3},{5,2,1},{5,4,1},{2,2,2}};
	int b=0,c=0;
	for(b=0;b<4;b++)
	{
		printf("行:%d",a[b][c]);	//保留这一行仅仅打印行
		for(c=0;c<4;c++) 
		{
			printf("列:%d",a[b][c]);
		}
		printf("\n");
	}
	//printf("1行第一列:%d\n1行第二列:%d\n1行第三列:%d\n",a[1][1],a[1][2],a[1][3]);
	return 0;
}
