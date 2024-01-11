// Accept value from user Print that  number of '*'

#include<stdio.h>

void star(int ino)
{
    int i = 0;

    for(i = 1 ; i <= ino ; i++)
    {
    printf("*\t");
    }
}

int main()
{
    int iValue = 0;
    

    printf("Enter the number of stars you want to print \n");
    scanf("%d",&iValue);

    star(iValue);


    return 0;
}