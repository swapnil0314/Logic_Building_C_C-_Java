// take character from user and check whther it is present in the string


#include<stdio.h>

int strlenChar(char *str, char cValue)
{
    int iCnt = 0;

    while(*str != '\0')
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
    char ch = '\0';
    int iRet = 0;


    printf("Enter string : \n");
    scanf("%[^'\n']s",Arr);   // Syntax for printing string with white space
 
    printf("ENter the character  : \n");
    scanf("%c",&ch);

    iRet = strlenChar(Arr,ch);

    printf("number of occurences are :  %d\n",iRet);

    return 0;

}