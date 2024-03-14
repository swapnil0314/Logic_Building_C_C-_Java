// Accept a string from user and copy that string in new array

#include<stdio.h>

void strcpyX(char *src , char *dest)
{

// filled notebook is src  &  empty notebook is destination
    while (*src != 0)
    {
        *dest = *src;
        *src++;
        *dest++;
    }
   *dest = '\0';            //expilcitely lihaycha 
    
}

int main()
{
    char Arr[20];  // filled notebook
    char Brr[20];  // empty notebook

    printf("Enter string : \n");
    scanf("%[^'\n']s",Arr);

    strcpyX(Arr,Brr);

    printf("String after copy is : %s\n",Brr);

    return 0;
}