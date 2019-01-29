#include<stdio.h>
int main(void)
{
    int a=0;
    int b=0;
    int c=0;
    int d=0;
    printf("Enter Int\n");
    printf("d=(a*b)+c\n");
    scanf("%d",&a);
    scanf("%d",&b);
    scanf("%d",&c);
    d=(a*b)+c;
    printf("Output int %d \n",d);
    return 0;
}