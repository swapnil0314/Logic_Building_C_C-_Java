// 1  : travel till end of destination
// 2 :  copy the data from src to dest
// 3 : write '\0' at the end of dest

#include<stdio.h>

void strncatX(char *src , char *dest , int iLength)
{
    while (*dest != 0)
    {
        dest++;
    }

    dest--;

    while ((*src != 0) && (iLength != 0))
    {
        *dest = *src ;
        dest++;
        src++;

        iLength--;

        if(iLength == 0)
        {
            break;
        }

         // 3 : write '\0' at the end of dest
   *dest = '\0';
    } 
}

int main()
{
    char Arr[20];  // filled notebook
    char Brr[20] = "Demo ";  // empty notebook
    int ino = 0;

    printf("Enter string : \n");
    scanf("%[^'\n']s",Arr);

     printf("ENter the number of letters that you wnat to concate\n");
    scanf("%d",&ino);

    strncatX(Arr,Brr,ino);

    printf("String after copy is : %s\n",Brr);

    return 0;
}