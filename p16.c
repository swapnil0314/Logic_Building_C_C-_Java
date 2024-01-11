//Accept a number from user and print hello if the number is less than 10 else print demo.

#include<stdio.h>


void Display(int ino)
{
    if(ino < 10)
    {
        printf("HELLOOO");
    }
    else
    {
        printf("DEMOOO");
    }
}


int main()
{
    int ivalue = 0;

    printf("Enter the number : \n");
    scanf("%d",&ivalue);

    Display(ivalue);


    return 0;
}