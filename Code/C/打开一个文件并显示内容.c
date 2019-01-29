//file_eof.c -- 打开一个文件并显示其内容
#include<stdio.h>
#include<stdlib.h>
int main()        //为了使用exit()
{
    int ch;
    FILE * fp;
    char fname[50];     //用于存放文件名
    
    printf("确认输入的文件名: ");
    scanf("%s",fname);
    fp=fopen(fname,"r"); //打开文件供读取
    if (fp==NULL)
    {
        printf("打开文件失败.再见\n");
        exit(1);     //终止程序
    }
    //getc(fp)从打开的文件中获取一个字符
    while ((ch=getc(fp))!=EOF)
             putchar(ch);
     fclose(fp);    //关闭文件
     return 0;
}