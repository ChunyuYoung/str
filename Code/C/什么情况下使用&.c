#include<stdio.h>
int main(void)
{
	int age;
	float assets;
	char pet[30];
	
	printf("输入你的年龄,资产,最喜欢的宠物.\n");
	scanf("%d %f",&age,&assets);
	scanf("%s",pet);
	printf("%d $%.2f %s\n",age,assets,pet);
	return 0;
}