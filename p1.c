// Accept two values and perform addition

#include<stdio.h>

int Addition(int iNo1 , int iNo2)
{
    int iSum = 0;

    iSum = iNo1 + iNo2;

    return iSum;
}

int main()
{
    int A =0 ,  B =0 , Ans = 0;
    
    

    printf("Enter the first value: \n");
    scanf("%d",&A);

    printf("Enter the second value: \n");
    scanf("%d",&B);

    Ans = Addition(A,B);

    printf("Addition of the numbers is %d",Ans);

    return 0;
}