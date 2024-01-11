#include<stdio.h>


float CalculatePer(int iMarks , int Total)
{
    auto float fPercentage = 0.0f;

    fPercentage =(((float)iMarks/(float)Total)*100);
    return fPercentage;
}
int main()
{
    int iValue1 =0;
    int iValue2 =0;
    float fRet = 0.0f;

    printf("Enter the marks:  \n");
    scanf("%d",&iValue1);

    printf("Enter the Total marks: \n");
    scanf("%d",&iValue2);

    fRet = CalculatePer(iValue1,iValue2);
    printf("Your Per is : %f\n",fRet);

    return 0;
}