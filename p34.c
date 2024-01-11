// accept number from user and print all numbers up to that number

#include<stdio.h>

void OddDisplay(int ino)
{
    int i = 0;

    for(i=0; i<=ino ; i++)
    {
        if((i%2)!=0)
        {
        printf("%d\t",i);
        }
    }
}

int main()
{
    int ivalue =0;
    printf("Enter number: \n");
    scanf("%d",&ivalue);

    OddDisplay(ivalue);

    return 0;
}