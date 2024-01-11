// CheckWhether The given number is even or odd

#include<stdio.h>
#include<stdbool.h>

void Display(int ino)
{
    if((ino % 2)==0)
    {
        printf("The number is even \n");
    }
    else
    {
        printf("The number is odd \n");
    }
    

}

int main()
{
    int iValue = 0;

    printf("Enter the given number: \n");
    scanf("%d",&iValue);

    Display(iValue);


    return 0;
}