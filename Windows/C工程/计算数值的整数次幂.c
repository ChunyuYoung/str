//power.c -- 计算数值的整数次幂
#include<stdio.h>
double power(double n,int p); //ANSI原型
int main(void)
{
	double x,xpow;
	int exp;
	
	printf("输入一个数字和正整数的幂");
	printf("而\n这个数字就会上升。按q");
	printf("则退出。\n");
	while(scanf("%lf%d",&x,&exp)==2)
	{
		xpow=power(x,exp);  //函数调用
		printf("%.3g到电源是%d是%.5g\n",x,exp,xpow);
		printf("确认下一对数字或q退出。\n"); 
	 } 
	 printf("希望你享受这次权利之旅--再见\n");
	 return 0;
 } 
 double power(double n,int p)  //函数定义 
 {
 	double pow =1;
 	int i;
 	
 	for(i=1;i<=p;i++)
 		pow *=n;
 	return pow;
 }
