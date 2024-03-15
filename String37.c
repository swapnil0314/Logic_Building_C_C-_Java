// 1  : travel till end of destination
// 2 :  copy the data from src to dest
// 3 : write '\0' at the end of dest

#include<stdio.h>

void strcatX(char *src , char *dest)
{
    while (*dest != 0)
    {
        dest++;
    }
    dest--;

    *dest = ' ';
    dest++;

    while (*src != 0)
    {
        *dest = *src;
        dest++;
        src++;
    }
    
    dest = '\0';
}

int main()
{
    char Arr[20];  // filled notebook
    char Brr[20] = "Demo ";  // empty notebook

    printf("Enter string : \n");
    scanf("%[^'\n']s",Arr);

    strcatX(Arr,Brr);

    printf("String after copy is : %s\n",Brr);

    return 0;
}