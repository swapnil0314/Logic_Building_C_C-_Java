// accept number from user and display the summation of its non factors

#include<stdio.h>

int FactRev(int ino)
{
    int iCnt = 0;
    int iSum = 0;

    for(iCnt = 1 ; iCnt < ino ; iCnt++ )
    {
        {
            if((ino % iCnt) != 0)
            {           
            printf("%d\t",iCnt);
            iSum = iSum + iCnt;
            }           
        }    
            
    }
    return iSum;
}

int main()
{
    int ivalue = 0;
    int sum = 0;
    printf("Enter number\n");
    scanf("%d",&ivalue);

    sum = FactRev(ivalue);
    printf("the summation of all the factors is : %d ",sum);
    return 0;
}