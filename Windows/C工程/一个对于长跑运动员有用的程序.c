/*一个对于长跑运动员有用的程序*/
#include<stdio.h>
const int S_PER_M=60;
const int S_PER_H=3600;
const int M_PER_K=0.62137;
int main(void)
{
	double distk,distm;
	double rate;
	int min,sec;
	int time;
	double mtime;
	int mmin,msec;
	printf("这个程序转换时间为指标竞赛\n");
	printf("跑一英里的平均水平\n");
	printf("英里每小时的速度\n");
	printf("请输入,公里,运行的距离.\n");
	scanf("%lf",&distk);
	printf("接下来确认时间分钟和秒数.\n");
	printf("首先确认分钟\n");
	scanf("%d",&min);
	printf("现在确认秒数.\n");
	scanf("%d",&sec);
	//把时间转换为全部用秒表示
	time = S_PER_M * min + sec;
	//把公里转换为英里
	distm = M_PER_K * distk;
	//英里/秒×秒/小时=英里/小时
	rate = distm / time * S_PER_H;
	//时间/距离=跑完每英里的用时
	mtime = (double)time / distm;
	mmin = (int)mtime / S_PER_M;
	msec = (int)mtime % S_PER_M;
	printf("你跑 %1.2f 千米(%1.2f 千米)在 %d 分钟,%d 秒.\n",distk,distm,min,sec);
	printf("这个速度应在与 %d 分钟跑完一英里",mmin);
	printf("%d 秒,\n你的平均速度是 %1.2f 英里.\n",msec,rate);
	return 0;
}