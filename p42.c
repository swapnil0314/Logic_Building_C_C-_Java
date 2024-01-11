// accept temperature in fahrenheit and convert it into celsius

#include<stdio.h>

double FhtoCs(float fTemp)
{
    float celsius = 0.0f;

    celsius = ((fTemp-32)*(5/9));

    return celsius;

}

int main()
{
    float fValue = 0.0f;
    double dRet = 0.0;

    printf("Enter temp in Fahrenheit: ");
    scanf("%d",&fValue);

    dRet=FhtoCs(fValue);
    printf("Temp in celsius is : %lf\n",dRet);

    return 0;
}