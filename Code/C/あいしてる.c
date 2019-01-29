#include<stdio.h>
int main(void )
{
    int open;
    int panduan;
    int qiantao;
    printf("はじめまして(1/q)\n");
    panduan=scanf("%d",&open);
    while (panduan==1)
    {
        for (qiantao=0;qiantao<7;qiantao++)
        {
    printf("あいしてる\n");
    printf("あいしてる\n");
    printf("あいしてる\n");
        }
        char panduan;
        panduan='q';
        printf("1/q\n");
        scanf("%c",&panduan);
    }
    printf("ありがとう\n");
    return 0;
}