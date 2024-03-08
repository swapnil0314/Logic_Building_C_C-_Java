// Accept string from user and count number of characters in the string


#include<stdio.h>
#include<string.h>


int main()
{
    char Arr [40];
    int iRet = 0;

    printf("Enter String : \n");
    scanf("%[^'\n']s",&Arr);

    iRet=strlen(Arr);

    printf("Length  is : %d\n",iRet);

    return 0 ;
}