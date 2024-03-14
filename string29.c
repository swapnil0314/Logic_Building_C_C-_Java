// take character from user and check whther it is present in the string


#include<stdio.h>
#include<stdlib.h>
#define ERR_NOTFOUND -1

int LastOccurance(char *str , char cValue)
{
    int iCnt = 0;
    int iPos = 0 ;
    
    while (*str != '\0')
    {
        if(*str == cValue)
        {
           iPos= iCnt;
        }
        str++;  
        iCnt++; 
    }
    return iPos;
    

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

    iRet = LastOccurance(Arr , ch);
    if(iRet == ERR_NOTFOUND)
    {
        printf("There is no such character\n");
    }
    else
    {
        printf("Last ocuurance of that character is at : %d\n",iRet);
    }
    return 0 ;
}