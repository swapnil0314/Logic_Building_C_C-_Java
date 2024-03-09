#include<stdio.h>
#define ERR_NOTFOUND -1


int FirstOccurance(char *str , char cValue)
{
    int iCnt = 0;

    while ((*str != '0') && (*str !=cValue))
    {
         str++;
         iCnt++;  
    }
    if(*str = '\0')
    {
        return -1;
    }
    else
    {
        return iCnt;
    }
    

}
int main()
{

    char Arr[20];
    char ch = '\0';
    int iRet = 0;

    printf("Enter string : \n");
    scanf("%[^'\n']s",Arr);

    printf("Enter the chracter : \n");
    scanf(" %c",&ch);

    iRet = FirstOccurance(Arr,ch);

    printf("The first occurence of char is at : %d",iRet);

    return 0 ;
}