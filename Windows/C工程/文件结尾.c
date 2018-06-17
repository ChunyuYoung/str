/*echo_eof.c*/
#include<stdio.h>
#define EOP (-1)
int main(void)
{
        int ch;
        
        while ((ch=getchar())!=EOP)
                    putchar(ch);
          return 0;
    }