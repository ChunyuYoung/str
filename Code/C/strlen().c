#include<stdio.h>
#include<string.h>
#define PRAISE "好一个超级神奇的名字!"
int main(void)
{
	char name[40];
	
	printf("你的名字是什么\n");
	scanf("%s",&name);
	printf("你好,%s.%s\n",name,PRAISE);
	printf("你的名字是 %d 字母占用 %d 内存单元.\n",strlen(name),sizeof(PRAISE));
	printf("占用%d记忆单元.\n",sizeof PRAISE);
	return 0;
}