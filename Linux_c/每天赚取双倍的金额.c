//每天赚取金额的双倍
#include<stdio.h>
int main(void)
{
	int a,b,c,d;
	a=0;
	b=0;
	while (a,b<=20)
	{
		a++;
		b++;
	    
	    d=b*b;
		printf("天数  金额\n");
		printf("%d      %d\n",a,b);
		printf("天数  双倍的金额\n");
		printf("%d      %d\n",a,d);
	}
	return 0;
}