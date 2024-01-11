// Accept number from user and print that number of * & $

#include<stdio.h>

void Pattern(int ino)
{
    int i =0;
    for(i=1; i<=ino ; i++)
    {
        printf("*   $ \t");
    }
    

}

int main()
{
    int ivalue = 0;
    printf("Enter number : ");
    scanf("%d",&ivalue);

    Pattern(ivalue);


    return 0;
}