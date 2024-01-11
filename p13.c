// Display the numbers in descending order

#include<stdio.h>

void Display(int ino)
{
    for(ino = 5 ;ino >= 1 ; ino-- )
    {
        printf("%d\t",ino);
    }
}

int main()
{
    int ivalue = 0;
    ivalue = 5;

    Display(ivalue);

    return 0;
}