// Accept one character from user and convert case the character

#include<stdio.h>


void Convert(char cha)
{
    if((cha >= 'a') || (cha <= 'z'))
    {
        cha = cha + 32;
        printf("The converted  character is %c \n",cha);
    }
    else if((cha >= 'A') || (cha <= 'Z'))
    {
                cha = cha - 32;
        printf("%c",cha);
    }
   
}

int main()
{
    char ch = '\0' ;

    printf("Enter the character that you want to convert \n");
    scanf("%c",&ch);

    Convert(ch);

    return 0;
}