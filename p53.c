// accept number from user and return the multiplication of all digits


#include<stdio.h>

int MultDigits(int ino)
{
    int mult = 1;
    int idigit = 0;

    while (ino != 0)
    {
        idigit = ino % 10;
      
        mult=idigit*mult;
       
        ino = ino / 10;
    }
    return mult;
    

}

int main()
{
    int ivalue = 0;
    int iRet = 0;

    printf("Enter number");
    scanf("%d",&ivalue);

    iRet = MultDigits(ivalue);

    printf("%d",iRet);

    return 0;
}