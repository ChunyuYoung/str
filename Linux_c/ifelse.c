#include<stdio.h>
int main(void)
{
    int num;
    printf("请输入数字！\n");
    while ((scanf("%d",&num))<2)
    {
    if (num==1)
    printf("num=1\n");
    else if (num>1)
    printf("num>1\n");
    else if (num!=1)
    printf("num!=1\n");
    else if (num<1)
    printf("num<1\n");
    else
    printf("请输入十进制整数！\n");
    }
    return 0;
}
/*
#include<stdio.h>
int main(void)
{
    int num;
    printf("请输入数字！\n");
    while ((scanf("%d",&num))!='q')
    {
    if (num==1)
    printf("num=1\n");
    else if (num!=1)
    printf("num!=1\n");
    else if (num<1)
    printf("num<1\n");
    else
    printf("num!=1\n");
    }
    printf("请输入十进制整数\n");
    return 0;
}
*/
