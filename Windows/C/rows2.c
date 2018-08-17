#include<stdio.h>
#define HANG 15
#define LIE 10
int main(void)
{
    int hang;
    char lie;
    for(hang=0;hang<HANG;hang++)
    {
        for(lie='A';lie<('A'+LIE);lie++)
            printf("%c",lie);
            printf("\n");
    }
return 0;
}