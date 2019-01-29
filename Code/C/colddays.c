//colddays.c -- 求出温度低于零度天数的百分率
#include<stdio.h>
int main(void)
{
	const int FREEZING =0;   //定义FREEZING为常量 -- 严寒的
	float temperature;       //温度
	int cold_days=0;         //冷天
	int all_days=0;          //所有天数
	
	printf("输入每日最低温度。\n");
	printf("使用摄氏度，输入q则退出\n");
	while(scanf("%f",&temperature)==1)
	{
		all_days++;        //所有天数加1
		if(temperature<FREEZING)    //如果温度 小于 严寒的(o°)
			cold_days++;     //条件为真时加1
	}
	if(all_days!=0)  //如果每天温度不等于0
		printf("%d天数总计:%.1f%%在冰点以下.\n",all_days,100.0*(float)cold_days/all_days);
	if(all_days==0)  //如果每天温度等于0
		printf("没有数据输入!\n");
	return 0;
}
