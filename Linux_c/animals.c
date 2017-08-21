/*animals.c -- 使用switch语句*/
#include<stdio.h>
#include<ctype.h>
int main(void)
{
	char ch;
	printf("给我一封含有字母的信，我会给");
	printf("一个动物名称'\344'从这个信开始");
	printf("请输入一个字母：输入#已结束我的行为");
	while((ch=getchar())!='#')
	{
		if('\n'==ch)
			continue;
		if(islower(ch))	/*仅仅识别小写字母*/
			switch(ch)
			{
				case 'a':
					printf("亚里亚，亚洲的野羊");
					break;
				case 'b':
					printf("狒狒，马来的野猪");
					break;
				case 'c':
					printf("大衣，浣熊般的哺乳动物");
					break;
				case 'd':
					printf("水生，鼹鼠小动物");
					break;
				case 'e':
					printf("针鼹，多刺的食蚁兽");
					break;
				case 'f':
					printf("渔夫，棕色貂");
					break;
				default:/*当case执行完时会跳到这里并且结束switch语句，如果没有这个‘default’则将继续执行switch语句*/
					printf("这有点");/*switch语句结束*/		
			}
		else
			printf("我只识别小写字母");
		while(getchar()!='\n')
			continue;	/*跳过输入行的剩余部分*/
		printf("请输入另一个字母或#.\n");	/*while循环结束*/
	
	}
	printf("再见!\n");
	return 0;
}

