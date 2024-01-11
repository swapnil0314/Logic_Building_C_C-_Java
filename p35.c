// accept number from user and print first 5 multiples of that number

#include<stdio.h>

void MultipleDisplay(int ino)
{
    int i = 1;
    for(i=1 ; i<=5 ; i++)
    {
        printf("%d\t",(ino*i));
    }
}

int main()
{
    int ivalue =0;
    printf("Enter number: \n");
    scanf("%d",&ivalue);

    MultipleDisplay(ivalue);

    return 0;
}