// Accept radius from user and calculate its area

#include<stdio.h>

double CircleArea(float fRadius)
{
    float area = 0.0f;

    area = (3.14*fRadius*fRadius);

    return area;
}

int main()
{
    float fvalue = 0.0f;
    float dRet = 0.0f;

    printf("Enter radius: \n");
    scanf("%f",&fvalue);

    dRet = CircleArea(fvalue);
    printf("Area of circle is : %f",dRet);

    return 0;
}