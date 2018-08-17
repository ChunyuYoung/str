#include<stdio.h>
void STR(int n);
int main(void )
{
    printf("Hello World!\n");
    float n=12.334;
    STR(n);
    return 0;
}
void STR(int n)
{
    printf("%d",n);
}