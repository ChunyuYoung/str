//CM=FT=IN
#include<stdio.h>
const float FT = 0.032808399;
const float IN = 0.393700787;
int main(void)
{
	float a,b,c;
	printf("If a,b,c<0(quit)\n");
	while (a,b,c<0)
	{
		printf("获取CM\n");
		scanf("%f",&a);
		b=a*FT;
		c=a*IN;
		printf("=%f CM\n=%f FT\n=%f IN\n",a,b,c);
	}
	return 0;
}