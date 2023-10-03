
#include<stdio.h>


long int CalculateCube(int iValue)
{
   long int iAns = 1;

    iAns= iValue*iValue*iValue;

    return iAns;

}

int main()
{
    int iNo = 0;
   long  int iAns =1;

    printf("Enter num ..\n");
    scanf("%d",&iNo);

    iAns = CalculateCube(iNo);

    printf("Cube is : %d \n",iAns);

    return 0 ; 
}