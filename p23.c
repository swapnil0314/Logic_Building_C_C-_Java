// accept number from user and display its multiplication of factors.

#include<stdio.h>

int MultFact(int ino)
{
int iCnt = 0;
int mult = 1;

    for(iCnt = 1 ; iCnt < ino ; iCnt++)
    {
        if(((ino % iCnt)==0))
        {
          printf("%d\t",iCnt);
          mult = mult*iCnt;

        }
     }
     return mult;
    
}

int main()
{
    int ivalue =0;
    int iRet =0;

    printf("Enter number\n");
    scanf("%d",&ivalue);

    iRet = MultFact(ivalue);
    printf(" The multiplication is %d",iRet);

    return 0;
}