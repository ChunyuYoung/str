//分钟转换为小时和分钟
#include<stdio.h>
const int STR=60;
int main(void)
{
	float min,hour;
	while (min<0)
	{
		printf("获取分钟\n");
		scanf("%f",&min);
		hour=min/STR;
		printf("输出分钟为%.f,输出小时为%.2f\n",min,hour);
	}
	return 0;
}