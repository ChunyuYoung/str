#include<stdio.h>
int main(void)
{
    int t_ct;
    double time,x;
    int limit;
    
    printf("你想要输入的数量条款: ");
    scanf("%d",&limit);
    for (time=0,x=1,t_ct=1;t_ct<=limit;t_ct++,x*=2.0)
    {
        time+=1.0/x;
        printf("time=%f when terms=%d.\n",time,t_ct);
    }
    return 0;
}