// accept 3 number from user and display their average 


#include<stdio.h>

int  DisplayAvg(int ino1 , int ino2 , int ino3)
{
    float fAns = 0.0f;

    fAns = ((ino1+ino2+ino3)/3);

    return fAns;
}




int main()
{
    int ivalue1 = 0 , ivalue2 = 0 , ivalue3 =0;
    float fAvg = 0.0f;

    printf("Enter the first number \n");
    scanf("%d",&ivalue1);

    printf("Enter the second number \n");
    scanf("%d",&ivalue2);

    printf("Enter the third number \n");
    scanf("%d",&ivalue3);


    fAvg = DisplayAvg(ivalue1,ivalue2,ivalue3);
    printf("The average of the given numbers is :%f \n",fAvg);

    return 0 ;
}