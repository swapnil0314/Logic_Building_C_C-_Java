// Display the level according to the years 


#include<stdio.h>

void Display(int income)
{
    if((income >= 0) && (income <= 250 ))
    {
        printf("You are living in 2017\n");
    }
    else if ((income >= 250) && (income <= 500))
    {
         printf("You are living in 2019\n");
    }
    else if((income >= 500) && (income <= 800))
    {
        printf("You are living in 2020\n");
    }
    else if((income >= 700) && (income <= 820))
    {
        printf("You are living in 2022 , 2023");
    }
    
}


int main()
{
    int iValue = 0;

    printf("Enter your income: ");
    scanf("%d",&iValue);

    Display(iValue);

    return 0;
}