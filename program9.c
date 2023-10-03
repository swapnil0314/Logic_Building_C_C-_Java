

#include<stdio.h>

#define PI 3.14 
    float CalculateArea(float fValue)
    {
      auto float fAns=0.0f ;
      

      fAns=PI*fValue*fValue;

      return fAns;

    }

    
    int main()

    {
        auto float  fRadius=0.0f;
        auto float fArea = 0.0f;

        printf("enter radius :\n");
        scanf("%f",&fRadius);



       fArea= CalculateArea(fRadius);
        
        printf("Area of circle is %f \n", fArea);

        
      
        return 0;
    }