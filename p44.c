//accept number from user and display all the numbers between that range

#include<stdio.h>

void  RangeDisplay(int iStart , int iEnd)
{
    int i = 0;
    int iSum = 0;
    for(i=iEnd ; i>=iStart ; i--)
    {
      printf("%d",i);
    }
   

}

int main()
{
    int ivalue1 = 0 , ivalue2 = 0 , iRet = 0;

    printf("Enter starting point");
    scanf("%d",&ivalue1);

     printf("Enter starting point");
    scanf("%d",&ivalue2);

    RangeDisplay(ivalue1, ivalue2);
    

    return 0;

}