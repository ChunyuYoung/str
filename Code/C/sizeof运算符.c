#include<stdio.h>
int main(void)
{
	int n=0;
	size_t intsize;
	intsize=sizeof (int);
	printf("n=%d,n有%zd个字节;所有整数都有%zd字节.\n",n,sizeof n,intsize);
	return 0;
}