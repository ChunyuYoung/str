#include<stdio.h>
int main(void)
{
 
    int enter;
    printf("请输入您的年龄\n");
    scanf("%d",&enter);
    
    if (enter>18)
        printf("您已经成年了");
       else if (enter==18)
           printf("祝贺您今年满18岁了");
           else 
               printf("抱歉，您未满18岁");
     return 0;
    }