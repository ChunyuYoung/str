#include<stdio.h>
int main(void)
{
	int a,b;
	printf("获取a值\n");
	scanf("%d",&a);
	printf("获取b值\n");
	scanf("%d",&b);
	printf("求a%b的模\n");
	a=a-(a/b)*b;
	printf("%d",a);
	return 0;
}