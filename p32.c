// accept number from user and print its number line

#include<stdio.h>

void Display(int ino)
{
    int i =0;

    for(i=-ino ; i>=ino ; i--)
    {
        
        printf("%d\t",i);
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