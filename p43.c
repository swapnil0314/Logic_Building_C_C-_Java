// area in square feet and convert it into square meter 


#include<stdio.h>

double SquareMeter(int iValue)
{
    float fs = 0.0;
     fs = (0.0929*iValue);

    return fs;

}
int main()
{
    int iValue =0;
    double dRet = 0.0;

    printf("ENter area in square feet\n");
    scanf("%d",&iValue);

    dRet = SquareMeter(iValue);

    printf("The value is : %lf ",dRet);

    return 0;
}