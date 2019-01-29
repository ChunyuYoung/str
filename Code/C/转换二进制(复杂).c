#include<cstdio>
int main(void)
{
    int str[100];/*定义数组,用来保存已求出的二进制数*/
    int a;
    int i=0;/*记录二进制数的个数*/
    scanf("%d",&a);
    while (a!=0)/*当a=1时a/=2之后a=0*/
    {
        int b=a%2; /*取余数*/
        a/=2;  /*根据公式把a/2*/
        str[i]=b;  /*记录求出的二进制数*/
        i++;   /*二进制数个数加1*/
    }
    for (i--;i>=0;i--)  /*i--是多求了一个数*/
    printf("%d",str[i]);
    return 0;
}