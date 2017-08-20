#include<stdio.h>
int main(void)
{
	long long a,b,c;  //加法
	long long d,e,f;  //减法
	long long g,h,i;  //乘法
	long long j,k,l;  //除法
	long long m,n,o;  //求模

	printf("加法 获取第一个值\n");
	scanf_s("%ll",&a);
	printf("获取第二个值\n");
	scanf_s("%ll",&b);
	c=a+b;
	printf("加法 计算结果为%ll\n",c);

	printf("减法 获取第一个值\n");
	scanf_s("%ll",&d);
	printf("获取第二个值\n");
	scanf_s("%ll",&e);
	f=d-e;
	printf("减法 计算结果为%ll\n",f);

	printf("乘法 获取第一个值\n");
	scanf_s("%ll",&g);
	printf("获取第二个值\n");
	scanf_s("%ll",&h);
	i=g*h;
	printf("乘法 计算结果为%ll\n",i);

	printf("除法 获取第一个值\n");
	scanf_s("%ll",&j);
	printf("获取第二个值\n");
	scanf_s("%ll",&k);
	l=j/k;
	printf("除法 计算结果为%ll\n",l);

	printf("求模 获取第一个值\n");
	scanf_s("%ll",&m);
	printf("获取第二个值\n");
	scanf_s("%ll",&n);
	o=m%n;
	printf("求模 计算结果为%ll\n",o);

	return 0;
}
