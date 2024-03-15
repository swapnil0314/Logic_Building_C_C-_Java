// Accept 1 string  from user and reverse the contents of string in that place

#include<stdio.h>

void strrevX(char *str)
{
    char *start = NULL;
    char *end = NULL;
    char temp ='\0';

    start = str;
    end = str;

    while (*end != '\0')
    {
        end++;
    }
    end--;

    while (start < end)
    {
        temp = *start;
        *start=*end;
        *end=temp;

        start++;
        end--;
    }
}

int main()
{
   char Arr[40];
   
    printf("Enter the string: ");
    scanf("%[^'\n']s",Arr);

    strrevX(Arr);

    printf("The reversed string is : %s",Arr);

    return 0;
}