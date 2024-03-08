// accept number from user and check the Capital characters in the string


// uer of our function
#include<stdio.h>

int CheckCapital(char *str)

{
    int iCnt = 0;

    while (*str != '\0')
    {
       if((*str >= 'A') && (*str <= 'Z'))
       {
        iCnt++;
       }
       str++;
    }
    return iCnt;
}

int main()
{
    char Arr[40];
    int iRet = 0;

    printf("Enter the string \n");
    scanf("%[^'\n']s",Arr);

    iRet = CheckCapital(Arr);

    printf("The num of capital letters are : %d",iRet);


    return 0;
}