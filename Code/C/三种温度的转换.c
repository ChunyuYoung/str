#include<stdio.h>
void Temperaturos(double);
int main(void)
{
	double Fahrenheit;
	printf("请输入华氏温度:");
	while(scanf("%lf",&Fahrenheit)==1)
	{
		Temperaturos(Fahrenheit);
		printf("请输入华氏温度:");
	}
	printf("end\n");
	return 0;
}
void Temperaturos(double Fahrenheit)
{
	const double a=1.8,b=32.0,c=273.16;
	printf("华氏温度=%lf\t",Fahrenheit);
	printf("摄氏度=%lf\t",a*Fahrenheit+b);
	printf("绝对温度=%lf\n",a*Fahrenheit+b+c);
}