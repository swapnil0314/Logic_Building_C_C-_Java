// Accept one character from user and check whether that character is vowel or not

#include<stdio.h>
#include<stdlib.h>
#include<stdbool.h>

bool ChkVowel(char ch)
 {
    if((ch =='a') || (ch =='e') || (ch =='i') || (ch =='o') || (ch =='u'))
    {
        return true;
    }
    else
    {
        return false;
    }
 }

int main()

{
    char cValue = '\0';
    bool bRet = false;

    printf("Enter character \n");
    scanf("%c",&cValue);

    bRet = ChkVowel(cValue);

    if(bRet == true)
    {
        printf("It is a Vowel");
    }
    else
    {
        printf("It is not a Vowel");
    }

return 0;
}