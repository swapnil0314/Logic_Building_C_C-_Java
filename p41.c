// accept width and height and calculate the area 
#include<stdio.h>

double RectArea(float fwidth , float fheight)
{
    double Area = 0.0;

    Area = (fwidth*fheight);

    return Area;

}

int main()
{
    float fvalue1 = 0.0 , fvalue2 = 0.0;
    double dRet = 0.0;

    printf("Enter width \n");
    scanf("%f",&fvalue1);

    
    printf("Enter Height \n");
    scanf("%f",&fvalue2);

    dRet = RectArea(fvalue1 , fvalue2);

    printf("Area of the rectangle is %lf \n",dRet);

    return 0;
}