// write a program which accepts three numbers and print its multiplication

#include<stdio.h>

int Multiply(int ino1 , int ino2 , int ino3)
{
     int iAns = 0;
        if((ino1 !=0) && (ino1 !=0) && (ino1 !=0))
        {
        iAns = (ino1*ino2*ino3);
        return iAns;
        }
    
}

int main()
{
    int ivalue1 = 0 ,ivalue2 =0 , ivalue3 = 0 , iRet =0;

    printf("Please enter the three numbers: \n");

    scanf("%d %d %d", &ivalue1, &ivalue2 , &ivalue3);

    iRet = Multiply(ivalue1,ivalue2,ivalue3);

    printf("THE  Multiplication is : %d",iRet);
}