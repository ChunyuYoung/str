#include "stdio.h"
#define STR 3
int main(void )
{
    int xunhuan;/*执行循环次数*/
    char str[STR]; /*获取数组*/
 
    printf("确认数组个数%d\n",STR);
    for (xunhuan=0;xunhuan<STR;xunhuan++)
    scanf("%c",&str[xunhuan]);
    for (xunhuan=0;xunhuan<STR;xunhuan++)
    printf("%c",str[xunhuan]);
    printf("\n");
    return 0;
}