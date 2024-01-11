//Accept three numbers from user and return the maximum number 

#include<stdio.h>

int max(int ino1 , int ino2 , int ino3)
{
    if((ino1 > ino2) && (ino1 > ino3))
    {
        return ino1;
    }
    else if((ino2 > ino1) &&(ino2 > ino3))
    {
        return ino2;
    }
    else
    {
        return ino3;
    }
}



int main()
{
    int ivalue1 = 0 , ivalue2 = 0, ivalue3 =0;
    int imaximum = 0;

    printf("Enter the first number: \n");
    scanf("%d",&ivalue1);

     printf("Enter the second number: \n");
    scanf("%d",&ivalue2);

     printf("Enter the third number: \n");
    scanf("%d",&ivalue3);

    imaximum = max(ivalue1,ivalue2,ivalue3);
    printf("The maximum value is : %d",imaximum);

    return 0;
}