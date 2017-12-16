#include<stdio.h>
int number(int a,int b);
int main(void)
{
	int q,w,e;
	w=10;
	q=5;
	e=number(q,w);
	printf("·µ»ØÖµÎª£º%d%d",q,w);
	return 0;
}
int number(int a,int b)
{
	return a+1;
}
