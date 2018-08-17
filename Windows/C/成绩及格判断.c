//学生成绩的判断
#include<stdio.h>
int main(void)
{
	float score;
	printf("请输入学生的成绩!\n");
	scanf("%f",&score);
	if(score>=80 && score<=100)
	{
		printf("你的成绩为优秀!\n");
	}
	else
	{
		if(score<=80 && score>=72)
		{
			printf("你的成绩为良好!\n"); 
		}
		else
		{
			printf("你的成绩不及格!\n"); 
		 } 
	}
	return 0;
 } 
