//Int计算器
#include<stdio.h>
int main(void)
{
	int a,b,c;
	int d,e,f;
	int g,h,i;
	int j,k,l;
	int m,n,o; 
	
		printf("Int加法计算获取值\n");
		scanf("%d",&a);
		printf("Int加法计算获取值\n");
		scanf("%d",&b);
		c=a+b;
		printf("两数和为%d\n\n",c);
		
		printf("Int减法计算获取值\n");
		scanf("%d",&d);
		printf("Int减法计算获取值\n");
		scanf("%d",&e);
		f=d-e;
		printf("两数差为%d\n\n",f);
		
		printf("Int乘法计算获取值\n");
		scanf("%d",&g);
		printf("Int乘法计算获取值\n");
		scanf("%d",&h);
		i=g*h;
		printf("两数积为%d\n\n",i);
		
		printf("Int除法计算获取值\n");
		scanf("%d",&j);
		printf("Int除法计算获取值\n");
		scanf("%d",&k);
		l=j/k;
		printf("两数商为%d\n\n",l);
		
		printf("Int求模计算获取值\n");
		scanf("%d",&m);
		printf("Int求模计算获取值\n");
		scanf("%d",&n);
		o=m%n;
		printf("两数求模为%d\n\n",o);
        return 0;
}