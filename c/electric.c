/* electric.c -- 计算用电账目 */
#include<stdio.h>
#define RATE1 0.12589  //第一个360kwh的费率
#define RATE2 0.17901  //第二个320kwh的费率
#define RATE3 0.20971  //超过680kwh的费率
#define BREAK1 360.0  //费率的第一个分界点
#define BREAK2 680.0  //费率的第二个分界点
#define BASE1 (RATE1 * BREAK1)  //用电360kwh的费用
#define BASE2 (BASE1+(RATE2*(BREAK2-BREAK1)))  //用电680kwh的费用

int main(void)
{
	double kwh;  //用电千瓦小时数
	double bill;  //费用
	
	printf("请输入使用的千瓦时数。\n");
	scanf("%lf",&kwh);  //%lf是double类型的说明符
	if(kwh<=BREAK1)
		bill = RATE1 * kwh;
	else if(kwh<=BREAK2)  //用电量在360kwh和680kwh之间时
		bill=BASE1+(RATE2*(kwh-BREAK1));
	else  //用电量超出680kwh时
		bill=BASE2+(RATE3*(kwh-BREAK2));
	printf("收费%.1fkwh是$%1.2f。\n",kwh,bill);
	return 0;
}
