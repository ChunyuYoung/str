/*遇到#终止程序，读取空格和换行和其他字符数目*/
#include<stdio.h>
int main(void)
{
    char xunhuan;
    int a=0,b=0,c=0;
    
    printf("获取一个字符，输入#结束\n");
    
    while (scanf("%c",&xunhuan),xunhuan!='#')
    {
        if (xunhuan==' ')
        {
            a++;
        }
            if (xunhuan=='\n')
            {
                b++;
            }
            
        
        c++;
    }
    printf("读取到%d个空格\n",a);
    printf("读取到%d个换行符\n",b);
    printf("总共有%d个字符\n",c);
    return 0;
}