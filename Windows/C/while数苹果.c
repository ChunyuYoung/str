#include<stdio.h>
int main(void)
{
	int apple=0,value=1;
	while(value<6)
	{
		apple=value+apple*3;
		value++;
	}
	printf("苹果总数为:%d",apple);
	return 0;
}
