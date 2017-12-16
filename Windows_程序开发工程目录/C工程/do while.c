/*do_while.c --退出条件循环*/
#include<stdio.h>
int main(void)
{
    const int secret_code = 13;
    int code_entered;
    
    do
    {
        printf("进入恐惧数字13症治疗俱乐部\n");
        printf("请键入一个密码: ");
        scanf("%d",&code_entered);
    } while (code_entered ==secret_code);
    printf("祝贺!你治愈了!\n");
    return 0;
}