//accept number from user and check whether it contains 0

#include<stdio.h>

#define TRUE 1
#define FALSE 0

typedef int BOOL;

BOOL ChkZero(int iNo)
{
    int idigit = 0;

    while (iNo!=0)
    { 
       if((iNo%10) ==0)
       {
        return 1;
       }
       iNo=iNo/10;
      
    }
        return 0;
       
       

}

int main()
{
    int ivalue = 0;
    BOOL bRet = FALSE;

    printf("ENter number");
    scanf("%d",&ivalue);

    bRet = ChkZero(ivalue);

    if(bRet == TRUE)
    {
        printf("It contains Zero");
    }
    else
    {
        printf("There is no zero");
    }
}