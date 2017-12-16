#include<stdio.h>
int main(void)
{
    int i=0,j=14,k=2,s=0;
    for(;;)
    {
        i+=k;
        if(i>j)
        {
            printf("q\n");
            printf("%d",s);
            break;
        }
        s+=i;
    }
}