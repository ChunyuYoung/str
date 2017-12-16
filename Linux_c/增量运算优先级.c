//增量运算优先级
#include<stdio.h>
int main(void)
{
	int y=2,n=3,next;
	next=(y+n++)*6;
	printf("%d",next);
	return 0;
}