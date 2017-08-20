#include<stdio.h>
void str(void);
int main(void)
{
	int a=0,b=1;
	printf("两个while死循环开始,享受死机的感觉吧\n");
	str();
	while (0<2)
	{
		printf("两个while死循环开始,享受死机的感觉吧\n");
		printf("%d %d",a,b);
	}
	return 0;
	}
	
	void str(void)
	{
		int c=0,d=1;
		while (0<2)
		{
			printf("%d %d %d",c,c,d);
			printf("%d %d",d,c);
		}
	}
		