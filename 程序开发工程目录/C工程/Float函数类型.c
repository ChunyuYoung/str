#include<stdio.h>
int main (void)
{
	float a;
	printf ("输入一个整数吧\n") ;
	scanf("%f",&a) ;
	
	
	a =a*100.1234;
	printf ("%.4f", a) ;
	return 0 ;
} 