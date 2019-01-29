#include<stdio.h>
int main(void)
{
	float weight;
	float value;
	printf("你知道你的重量价值吗？\n") ;
	printf ("让我们看看\n") ;
	printf ("请输入的体重在英镑\n") ;
	scanf("%f",&weight);
	
	value = 770*weight *14.5833;
	printf("你的重量价值 $%. 2f.\n", value) ;
	printf ("如果铑元素的价格下降，你的价格会很便宜\n");
	printf("多吃饭保持你的价值") ;
	return 0 ;
} 