// accept number from user and display its factors in decreasing order

#include<stdio.h>

void FactRev(int ino)
{
    int iCnt = 0;
    int iCnt1 = 0;

    for(iCnt = (ino/2) ; iCnt >= 1 ; iCnt-- )
    {
        if((ino % iCnt) == 0 )
        {
            printf("%d\t",iCnt);
        }
    }

}

int main()
{
    int ivalue = 0;

    printf("Enter number\n");
    scanf("%d",&ivalue);

    FactRev(ivalue);
    
    return 0;
}