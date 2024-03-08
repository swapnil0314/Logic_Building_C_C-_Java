 // Accept string from user and count number of characters in the string

// uer of our function
#include<stdio.h>

int strlenX(char *str)
{
    int iCnt = 0;

    while (*str != '\0')
    {
        iCnt++;
        str++;
    }
    return iCnt;
}

int main()
{
    char Arr [40];
    int iRet = 0;

    printf("Enter string: \n");
    scanf("%[^\n]s",Arr);

    iRet = strlenX(Arr);

    printf("Length of the string is : %d\n",iRet);

    return 0;
}