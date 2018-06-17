#include<stdio.h>
int main(void)
{
	int a= 1;
	while (a<64)
	{
		printf("%d%d%d%d%d",a,a-a,a,a-a,a);

	}
	return 0;
}