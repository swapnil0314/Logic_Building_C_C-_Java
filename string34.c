// toggle : capital to small and small to capital


#include<stdio.h>

void strcpytoggleX(char *src , char *dest)
{
    int Gap = 'a'-'A';
// filled notebook is src  &  empty notebook is destination
    while (*src != 0)
    {
       if((*src >= 'A') && (*src <= 'Z'))
       {
        *dest = *src + Gap;
       }
       else if ((*src >= 'a') && (*src <= 'z'))
       {
        *dest = *src - Gap;
       }
       else
       {
        *dest = *src ;
       }
       dest++;
       src++;
    }
   *dest = '\0';            //expilcitely lihaycha 
    
}

int main()
{
    char Arr[20];  // filled notebook
    char Brr[20];  // empty notebook

    printf("Enter string : \n");
    scanf("%[^'\n']s",Arr);

    strcpytoggleX(Arr,Brr);

    printf("String after copy is : %s\n",Brr);

    return 0;
}