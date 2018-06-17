//for()a++多加一次
#include<stdio.h>
#define HANG 26
#define LIE 26
int main( void )
{
    int hang;
    int number=1;
    char lie;
    for (hang=0;hang<=HANG;hang++)
    {
        printf("%d ",number++);
        for (lie='A';lie<=('A'+LIE);lie++)
              printf("%c",lie);
              printf("\n");
    }
    return 0;
}