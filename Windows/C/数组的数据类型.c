#include<stdio.h>
int main(void)
{
	char array[]={'a','b','c'};		//没有直接定义元素的个数 
	int a=0;
	
	for(a=0;a<3;a++)
	{
		printf("%c",array[a]);		//直接使用a这个变量来输出 
	}
	return 0;
}
