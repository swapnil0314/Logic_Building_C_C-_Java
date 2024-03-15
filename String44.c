// Accept string from user and check whether string is palindrome or not

#include<stdio.h>
#include<stdbool.h>

bool checkPalindrome(char *str)
{
    char *start = NULL;
    char *end = NULL;
    bool bFlag = true;


    start = str;
    end  = str;

    while(*end != '\0')
    {
        end++;
    }
    end--;

    while(start < end)
    {
        if(*start != *end)
        {
            bFlag = false;
            break;
        }
        start++;
        end--;     
    }
    return bFlag;

}


int main()
{

    char Arr[20];
    bool bRet = false;
    

  printf("Enter string :\n");
  scanf("%[^'\n']s",Arr);

   bRet = checkPalindrome(Arr);

   if(bRet == true)
   {
    printf("String is palindrome");
   }
   else
   {
    printf("String is not a palindrome");
   }
    return 0;

}