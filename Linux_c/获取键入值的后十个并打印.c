//获取值后的10个值并打印
#include<stdio.h>
int main( )
{
	int a,b;
	printf("input the first number\n");
	scanf("%d",&a);
	printf("%d\n",a);
	b=a;
	printf("this  is what you want\n");
	while(b<=(a+10))
	  {
	  	b++;
	  	printf("%d\n",b);
	  }
	  return 0;
}