#include<stdio.h>
int num(int);
int main(void)
{
	int n=100,s=0;
	s=num(n);
	printf("1��100��Ϊ:%d",s);
	return 0;
}
int num(int n)
{
	if(n==1)
		return 1;
	else
		return n+num(n-1);
}
