// take character from user and check whther it is present in the string


#include<stdio.h>
#include<stdlib.h>
#define ERR_NOTFOUND -1
int strlenChar(char *str , char cValue)
{
    int iCnt = 0;

    while (*str != 0)
    {
        if(*str == cValue)
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
    char ch ='\0';
    int iRet = 0;

    printf("Enter the String \n");
    scanf("%[^'\n']s",Arr);

    printf("Enter the character \n");
    scanf(" %c",&ch);

    iRet = strlenChar(Arr , ch);

    printf("Number of occurence are: %d",iRet);

    return 0 ;
}