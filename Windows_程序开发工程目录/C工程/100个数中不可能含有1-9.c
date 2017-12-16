#include<stdio.h>
int main(void)
{
   int number;
   
   for(number=0;number<100;number++)
   {
      if (number==1)
         continue;
         else if(number==2)
            continue;
           else if(number==3)
               continue;
              else if(number==4)
                  continue;
                 else if(number==5)
                     continue;
                    else if(number==6)
                        continue;
                       else if(number==7)
                          continue;
                          else if(number==8)
                             continue;
                             else if(number==9)
                                continue;
        else
            printf("%d",number);
            printf("\n");
   }
   return 0;
}