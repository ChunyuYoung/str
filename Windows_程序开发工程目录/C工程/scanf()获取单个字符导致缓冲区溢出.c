#include<stdio.h>
int main(void)
{
    char word;
    int number;
    printf("输入A\n");
    scanf("%c",&word);
    while (word=='A')
    {
        printf("缓冲区溢出%d\n输入其他值跳出循环\n",word);
        printf("Hello World\n");
        scanf("%c",&word);
    }
    printf("Successful");
    return 0;
}