#include<stdio.h>
#include<time.h>
#include<stdlib.h>

int main()
{
	int len;
    printf ("即将在0至99中间生成len个随机数并从大到小排序，请输入len=");
    scanf ("%d",&len);
   
    //产生随机数
    int a[len];
    		srand((int)time(0));	
    		int i;
    for(i=0;i<len;i++)
	{
		 int s=rand()%5;
   	 a[i]= s;
	}
	
	//输出排序前数组
	printf("排序前:");
	for(i=0;i<len;i++)
		{
			printf("%d ",a[i]);
		}
		
		
	//排序
	int j,k;
	for (i=0; i< len ; i++)
	{
		for (j = i+1 ; j < len ; j++)
		{
			if (a[i]<a[j])
			{
				k = a[i];
				a[i] = a[j];
				a[j] = k;
			}
		}
		}
//输出排序后数组
	printf("\n\n\n排序后:");
    for(i=0;i<len;i++)
		{
			printf("%d ",a[i]);
		}
}
	