//scores_in.c -- 使用循环进行数组处理
#include<stdio.h>          
#define SIZE 10      //申明size常量为什么
#define PAR 72      //申明par常量为难我
int main(void)
{
    int index,score[SIZE]; 
    int sum=0;
    float average;
     
    printf("确认高尔夫的的10个得分%d: \n",SIZE);
    for (index=0;index<SIZE;index++)
           scanf("%d",&score[index]);
     printf("阅读这些得分: \n");
     for (index=0;index<SIZE;index++)
             printf("%5d",score[index]);
       printf("\n");
       for (index=0;index<SIZE;index++)
               sum+=score[index];
               average=(float )sum/SIZE;
               printf("总计分数= %d ,平均数= %.2f \n",sum,average);
               printf("这是一个%.0f的阻碍 .\n",average-PAR);
               return 0;
}
    
     
     
    
    