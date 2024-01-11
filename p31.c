// accept number from user and print numbers till that number

#include<stdio.h>

void Display(int ino)
{
    int i =0;

    for(i=1 ; i<=ino ; i++)
    {
        printf("%d",i);
    }

}

int main()
{
    int ivalue = 0;

    printf("Enter number\n");
    scanf("%d",&ivalue);

    Display(ivalue);

    return 0;
}