#include<stdio.h>
int main(void)
{
	int num[]={10,5,20,31,4};
	int max,i;
	max=num[0];
	for(i=0;i<5;i++)
	{
		if(max<num[i])
		{
			max=num[i];		//�������ֵ�Ļ�,��ômaxֻ��һ��ֵ����Ҫ�жϵ�10 
			printf("max:%d\n",max);
		}
	}
	return 0;	
 } 
