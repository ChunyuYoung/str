#include <stdio.h>
int main(void)
{
    char S,T,R;
    char A,B,C;
    char Q,W,E;
    printf("Enter (3*char HEX)\n");
    scanf("%c",&S);
    scanf("%c",&T);
    scanf("%c",&R);
    printf("\'%#x\' \'%#x\' \'%#x\'",S,T,R);
    
    printf("\n\nEnter (3*char OCT)\n");
    scanf("%c",&A);
    scanf("%c",&B);
    scanf("%c",&C);
    printf("\'%#o\' \'%#o\' \'%#o\'",A,B,C);
    
    printf("\n\nEnter (3*char Dec)\n");
    scanf("%c",&Q);
    scanf("%c",&W);
    scanf("%c",&E);
  printf("\'%#d\' \'%#d\' \'%#d\'",Q,W,E);
  
    return 0;
}