// Accept number from user and return diff between summation of even digits 
// and summation of odd digits

#include<stdio.h>

int CountDiff(int ino)
{
   int iSumEven = 0;
   int iSumOdd = 0;
   int diff = 0;
   int idigit = 0;

   while (ino != 0)
   {
        idigit = ino % 10;
        if((idigit % 2)==0)
        {
            iSumEven = iSumEven + idigit;
        }
        else if ((idigit % 2)!=0)
        {
            iSumOdd = iSumOdd + idigit;
        }
        diff = (iSumEven-iSumOdd);
        ino = ino / 10;
    }
    return  diff;

}
int main()
{
    int ivalue = 0;
    int iRet = 0;

    printf("Enter number\n");
    scanf("%d",&ivalue);

    iRet = CountDiff(ivalue);
    printf("%d",iRet);

    return 0;
}