//wordcnt.c -- 统计字符、单词和行
#include<stdio.h>
#include<ctype.h>    //为isspace()提供函数原型
#include<stdbool.h>   //为bool、true和flase提供定义
#define STOP '|'
int main(void)
{
	char c;  //读入字符
	char prev;  //前一个读入字符
	long n_chars=0L;  //读入字符数
	int n_lines=0;    //行数
	int n_words=0;    //单词数
	int p_lines=0;    //不完整的行数
	bool inword=false;   //如果c在同一个单词中，则inword等于true
	
	printf("输入要分析的文本（|终止）：\n");
	prev='\n';    //用于识别完整的行数
	while((c=getchar())!=STOP)
	{
		n_chars++;     //统计字符
		if(c=='\n')
			n_lines++;     //统计行数
/*----↓----判-------段-------单----↓----词--------分--------割----↓----线*/
		if(!isspace(c) && !inword)
		{
			inword=true;   //开始一个新单词
			n_words++;   //统计单词
		}
		if(isspace(c) && inword)
			inword=false;   //到达单词的尾部
		prev =c;   //保存字符值
	}
	
	if(prev!='\n')
		p_lines=1;
	printf("字符数=%ld,单词数=%d,行数=%d",n_chars,n_words,n_lines);
	printf("不完整的行数=%d\n",p_lines);
	return 0;
}
