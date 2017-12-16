#include<stdio.h>
int main(void)
{
    char DEX=0xc000000f;
    
    printf("Example\n\n");
    printf("Error Code:c000000f\n");
    printf("DEX:%#x\n",DEX);
    printf("HEX:%#d\n",DEX);
    printf("OCT:%#o\n\n\n",DEX);
    
    char XUNHUAN;
    int PANDUAN;
    PANDUAN=1;
    while (PANDUAN<2)
    {
        printf("\n\n'Flase'\n\n");
        printf("Error Code:________\b\b\b\b\b\b\b\b");
        scanf("DEX:%x",&XUNHUAN);
        printf("HEX:%#x\n",XUNHUAN);
        printf("OCT:%#d\n",XUNHUAN);    
        printf("%#o\n",XUNHUAN);
    }
    return 0;
}