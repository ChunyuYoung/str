#include<stdio.h>
int main(void)
{
    char value;
    int xunhuan;
    while (scanf("%c",&value)!='#')
    {
        if (value == ' ')
        {
            xunhuan++;
            printf("Space:%d\n",xunhuan);
            }
        }
        printf("Exit!\n");
    }