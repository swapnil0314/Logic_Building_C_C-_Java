// accept number from user and display below pattern

#include<stdio.h>

void Pattern(int ino)
{

    int im = 0;

    for(im = 2 ; im <= (ino*2) ; im++)
    {
        if((im % 2)==0)
        {
        printf("%d",im);
        }
    }
}

int main()
{
    int ivalue = 0;

    printf("Enter number of elements: ");
    scanf("%d",&ivalue);

    Pattern(ivalue);

    return 0 ;
}