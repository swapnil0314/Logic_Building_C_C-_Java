// accept number from user and check the small characters in the string

// Accept string from user and count number of characters in the string

// uer of our function
#include<stdio.h>

int strlenSmall(char *str)
{
    int iCnt = 0;

    while (*str != '\0')
    {
        if((*str >= 'a') && (*str <= 'z'))
        {
        iCnt++;
       
        }
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

    iRet = strlenSmall(Arr);

    printf("Small characters in  the string are : %d\n",iRet);

    return 0;
}