#include<stdio.h>
int main(void)
{
	int i;
	for(i=0;i<10;i++)
	{
		if(i==4)
		continue;
		if(i==6)
		break;
		printf("iµÄÖµÎª:%d\n",i);
	}
	return 0;
}
