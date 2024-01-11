// Check whether the number is divisible by 5 or not

#include<stdio.h>
#include<stdbool.h>

bool Check(ivalue1)
{
    if((ivalue1 % 5)==0)
    {
        return true;
    }
    else
    {
        return false;
    }
    

}

int main()
{
    int ivalue1 = 0;
    bool Checkwhether = false; 

    printf("Enter the value which you want to check whether it is divisible by 5 or not \n");
    scanf("%d",&ivalue1);

    Checkwhether = Check(ivalue1);
    if(Checkwhether == true)
    {
        printf("The given number is %d divisible by 5\n",ivalue1);
    }
    else
    {
        printf("The given number %d is not divisible by 5",ivalue1);
    }

    return 0;
}