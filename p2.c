// Accept radius from user and display its area 

#include<stdio.h>

float area(int iNo)
{
    // area of circle = PI r*r

    float area = 0;

    area = (3.14 * iNo * iNo);

    return area;
}


int main()
{
    int r = 0 ;
    float Ans = 0;


    printf("Enter the radius of circle : \n");
    scanf("%d",&r);

    Ans = area(r);
    printf("Area of circle is : %f",Ans);

    return 0;
}