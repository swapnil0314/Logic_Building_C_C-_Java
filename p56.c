// accept number from user and display below pattern

#include<stdio.h>

void Pattern(int iNo)
{
    int iCnt = 0;
    for(iCnt = 1 ; iCnt<=iNo; iCnt++)
    {
        printf(" #    %d    *\t",iCnt);
    }

}

int main()
{
    int ivalue = 0;

    printf("Enter number of elements: ");
    scanf("%d",&ivalue);

    Pattern(ivalue);

    return 0 ;
}