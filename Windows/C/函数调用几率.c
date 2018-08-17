#include<stdio.h>
void butler(void);
int main(void)
{
    printf("1");
    butler();
    printf("2\n");
    return 0;
}
void butler(void)
{
    printf("3\n");
    printf("4");
}
