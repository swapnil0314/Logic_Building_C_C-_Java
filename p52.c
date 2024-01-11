// accept number from user and return the count of digits in between 3 and 7


#include<stdio.h>

int CountRange(int ino)
{
    int iCnt = 0;
    int idigit = 0;

    while (ino != 0)
    {
        idigit = ino % 10;
        if((idigit>3) && (idigit<7))
        {
            iCnt++;
        }
        ino = ino / 10;
    }
    return iCnt;
    

}

int main()
{
    int ivalue = 0;
    int iRet = 0;

    printf("Enter number");
    scanf("%d",&ivalue);

    iRet = CountRange(ivalue);

    printf("%d",iRet);

    return 0;
}