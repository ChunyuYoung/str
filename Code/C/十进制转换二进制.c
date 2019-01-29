#include<stdio.h>
int main(void)
{
    int A=83;
    int B,C,D;
    while (A!=0)
    {
        B=A/2;
        C=B/2;
        D=A-C;
        printf("%d",D);
    }
    return 0;
}