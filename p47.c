// accept number from user and count frequency of 2 in it.

#include<stdio.h>

int CountTwo(int iNo)
{
    int icnt = 0;
    int idigit = 0;

    while (iNo!=0)
    {
        idigit = iNo % 10;
        if(idigit < 6)
        {
            icnt++;
        }
        iNo = iNo/10;
    }
    return icnt;
    

}

int main()
{
    int ivalue = 0;
    int bRet = 0;

    printf("Enter number \n");
    scanf("%d",&ivalue);

    bRet = CountTwo(ivalue);
    printf("The number two  is displayed %dtimes\n",bRet);
    return 0;
}