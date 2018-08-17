#include<stdio.h>
#include<float.h>
#define FLT_DIG 1.0,3.0
#define DBL_DIG 1.0,3.0
int main(void)
{
	double a=1.0,b=3.0;
	float c=1.0,d=3.0;
	printf("%.4f %.12f %.16f\n",a,a,a);
	printf("%.4f %.12f %.16f\n",b,b,b);
	printf("%.4f %.12f %.16f\n",c,c,c);
	printf("%.4f %.12f %.16f\n",d,d,d);
	printf("%f %f",FLT_DIG,DBL_DIG);
	return 0;
}