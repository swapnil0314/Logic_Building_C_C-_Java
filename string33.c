// Accept a string from user and copy only small characters

#include<stdio.h>

void strcpyCap(char *src , char *dest)
{

// filled notebook is src  &  empty notebook is destination
    while (*src != 0)
    {
        if((*src >= 'A') && (*src <= 'Z'))
        {
        *dest = *src;
        *dest++;
        }
        *src++;

    }
   *dest = '\0';            //expilcitely lihaycha 
    
}

int main()
{
    char Arr[20];  // filled notebook
    char Brr[20];  // empty notebook

    printf("Enter string : \n");
    scanf("%[^'\n']s",Arr);

    strcpyCap(Arr,Brr);

    printf("String after copy is : %s\n",Brr);

    return 0;
}