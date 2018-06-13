#include<stdio.h>
int num(int);
int main(void)
{
	int n=100,s=0;
	s=num(n);
	printf("1µ½100ºÍÎª:%d",s);
	return 0;
}
int num(int n)
{
	if(n==1)
		return 1;
	else
		return n+num(n-1);
}
