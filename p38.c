// write a program to find factorial of given number

#include<stdio.h>

int Factorial(int ino)
{
    int iCnt = 1;
   while (ino != 0)
   {
    iCnt= iCnt*ino;
    ino--;
   }
   return iCnt;
   
}

int main()
{
    int ivalue = 0 , iRet = 0;

    printf("Enter number\n");
    scanf("%d",&ivalue);

    iRet = Factorial(ivalue);

    printf("Factorial of number is : %d",iRet);
    
}