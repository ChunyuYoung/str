/*超级死循环*/
#include<stdio.h>
void a(void);
void b(void);
void c(void);
void d(void);
void e(void);
void f(void);
void g(void);
void h(void);
void i(void);
void j(void);
int main(void)
{
	int a=10010;
	   
	while (a<20020)
	{
		printf("温馨提示:CPU压力测试\n");
		printf("%d\n",a);
		 a();
		b();
		c();
		d();
		e();
		f();
		g();
		h();
		i();
		j();
	}
	
	return 0;
}
void a(void)
{
	int b=10110;
	while (b<20220)
	{
		printf("%d",b);
	}
}
void b(void)
{
	int c=10;
	while (c<20)
	{
		printf("%d",c);
	}
}
void c(void)
{
	int d=1010;
	while (d<2020)
	{
		printf("%d",d);
	}
}
void d(void)
{
	int e=1111;
	while (e<1112)
	{
		printf("%d",e);
	}
}
void e(void)
{
	float f=1024.468;
	while (f<2000)
	{
		printf("%f",f);
	}
}
void f(void)
{
	double g=4096.13619199464;
	while (g<6000)
	{
		printf("%d",g);
	}
}
void g(void)
{
	int h=13619199464;
	while (h<23619199464);
	{
		printf("%d",h);
	}
}
void h(void)
{
	int i=2002;
	while (i<4000)
	{
		printf("%d",i);
	}
}
void i(void)
{
	int j=123456789;
	while (j<234567890)
	{
		printf("%d",j);
	}
}
void j(void)
{
	int z=2719859320;
	while (z<3719859320)
	{
		printf("%d",z);
	}
}
	