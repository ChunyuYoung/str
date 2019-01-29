/*do_while.c -- 退出条件循环*/
/*do while必定执行一次，至少执行一次*/ 
#include<stdio.h>
int main(void)
{
	const int secret_code = 13;    
	int code_entered;              
	
	do
	{
		printf("进入俱乐部恐怖数字13证,\n");
		printf("请选择输入的数字代码: ");
		scanf("%d,&code_entered");
	}
	while (code_entered != secret_code);
	printf("恭喜你！你已经痊愈了！\n");
	return 0;
 } 
