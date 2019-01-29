#include<stdio.h>
#define SIZE 8
int main(void)
{
	int by_twos[SIZE]; //定义by_twos为八个数组
	int index;

	for(index=1;index<=SIZE;index++)  

		by_twos[SIZE]=2*index;   //给数组赋值


		for(index=1;index<=SIZE;index++)  

			printf("%d",by_twos[SIZE]);  

		printf("\n");

	return 0;
}
