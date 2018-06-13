#include<stdio.h>
int main(void)
{
	int *p;
	int a;
	printf("输入一个整数型的地址:");
	scanf("%d",&a);
	printf("a的值为：%d\n取a地址:%p\n取a的十进制值：%d\n取a的值得十六进制：%p",a,&p,p=a,p=a);	//%d_p=a赋值操作 ,%p_p=a赋值为十六进制 
	return 0;
}
