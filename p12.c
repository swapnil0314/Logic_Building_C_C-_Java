// Display Marvellous 5 times
#include<stdio.h>

void Display(int ino)
{
    for(ino =1 ; ino <= 5 ; ino++)
    {
    printf("Marvellous \n");
    }
}

int main()
{
    int ivalue = 0;

    ivalue = 5;

    Display(ivalue);

    return 0;
}