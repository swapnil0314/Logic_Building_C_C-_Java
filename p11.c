// Accept numbers from user and return the division of that two numbers

#include<stdio.h>

float Display(float ino1 , float ino2)
{
    float fAns = 0.0f;
    if(ino1 > ino2)
    {
        fAns = (ino1/ino2);
        return fAns;
    }
    else
    {
        fAns = (ino2/ino1);
        return fAns;
    }
}


int main()
{

    float ivalue1 = 0, ivalue2 = 0;
    float Div = 0.0f;

    printf("Enter the first number \n");
    scanf("%f",&ivalue1);

    printf("Enter the second number \n");
    scanf("%f",&ivalue2);

    Div = Display(ivalue1,ivalue2);
    printf("The division of two numbers is : %f",Div);

    return 0;
}