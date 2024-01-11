// calculate cube of the given number

#include<stdio.h>

int Cube (int iNo)
{
    int ans = 0;
    ans = iNo*iNo*iNo;

    return ans;
}


int main()
{
    int num = 0;
    int cc =0;

    printf("Enter the number: ");
    scanf("%d",&num);

    cc = Cube(num);
    printf("The cube of the given number is : %d",cc);


    return 0;
}