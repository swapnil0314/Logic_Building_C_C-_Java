// Accept number from user and print its even factors 

#include<stdio.h>

int Facts(int ino)
{
int iCnt = 0;

    for(iCnt = 1 ; iCnt < ino ; iCnt++)
    {
        if(((ino % iCnt)==0) && ((iCnt % 2)==0))
        {
            {
            
            printf("%d",iCnt);
            }
        }
     }
}

int main()
{
    int ivalue =0;
    int Factors = 0;

    printf("Enter the number : \n");
    scanf("%d",&ivalue);

    Facts(ivalue);
    

    return 0;
}