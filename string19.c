// accept string from user and replace every whitespace with _

#include<stdio.h>

void EditString(char *str)
{
    while (*str != '\0')
    {
        if(*str == ' ')
        {
            *str='_';
        }
        str++;
    }
    

}

int main()
{
    char Arr[25];

    printf("Enter string: \n");
    scanf("%[^\n]s",Arr);

    EditString(Arr);

    printf("String after editing is : %s\n",Arr);

    return 0;
}