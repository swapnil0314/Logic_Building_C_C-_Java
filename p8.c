// accept two numbers from user and display which number is max and min

#include<stdio.h>

void Display(int ino1 , int ino2)
{
    if(ino1 > ino2)
    {
        printf("the first number %d is maximum\n",ino1);
    }
    else
    {
        printf("the second number %d is maximum\n",ino2);
    }



}


int main()
{
    int iValue1 = 0, iValue2 = 0;

    printf("enter the first number: \n");
    scanf("%d",&iValue1);

    printf("enter the second number: \n");
    scanf("%d",&iValue2);

    Display(iValue1,iValue2);

    return 0;
}