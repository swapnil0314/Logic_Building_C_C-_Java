// accept number from user and return the count of even digits

#include<stdio.h>

int CountEven(int ino)
{
    int iCnt = 0;
    int idigit = 0;

    while (ino != 0)
    {
        idigit = ino % 10;
        if((idigit % 2)==0)
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

    iRet = CountEven(ivalue);

    printf("%d",iRet);

    return 0;
}