/*escape.c - - 使用转义序列*/
#include<stdio.h>
int main(void )
{
    float salary;
    printf("\a确认你的salary: ") ;  /*1*/
    printf (" $_______\b\b\b\b\b\b\b") ;
    scanf("%f", & salary) ;
    printf ("\n\t $%. 2f一个月是$%. 2f a year. ", salary, salary * 12.0);
    printf (" \rGee! \n") ;
    return 0 ;
	
	
} 