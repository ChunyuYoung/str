#include<stdio.h>
int main(void)
{
	int k;
	
	for(k=1,printf("%d:Hi!\n",k);printf("k=%d\n",k),k*k<26;k+=2,printf("现在是%d\n",k))
		printf("返回k的值%d\n",k);
	return 0;
}
