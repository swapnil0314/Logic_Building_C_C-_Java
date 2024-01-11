// Accept number from user and divide that number by 2 if the remainder is 0 then display that the number is even.

#include<stdio.h>
#include<stdbool.h>

bool Check(int iNo)

{
    if((iNo%2)==0)
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

    int iNum  =0;
    bool bRet =false;

    printf("Enter the number : \n");
    scanf("%d",&iNum);

    bRet= Check(iNum);
    if(bRet==true)
    {
        printf("The given number is even \n");
    }
    else
    {
        printf("The given number is odd\n");
    }


    return 0;
 }