// Count the number of vowels


// uer of our function
#include<stdio.h>

int CountVowels(char *str)

{
    int iCnt = 0;

    while (*str != '\0')
    {
       if((*str == 'a')||(*str == 'e')||(*str == 'i')||(*str == 'o')||(*str == 'u')||(*str == 'A')||(*str == 'E')||(*str == 'I')||(*str == 'O')||(*str == 'U'))
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

    iRet = CountVowels(Arr);

    printf("The num of vowels are : %d",iRet);


    return 0;
}