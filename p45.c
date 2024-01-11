// Accept number from user and display its digits in reverse order 

#include<stdio.h>

void DisplayDigit(int ino)
{
    int iDigit = 0;

   
    while (ino != 0)
    {
       iDigit= ino%10;
       printf("%d",iDigit);
       ino = ino /10;
    }
    

}
int main()
{
    int ivalue =0;

    printf("Enter number\n");
    scanf("%d",&ivalue);

    DisplayDigit(ivalue);

    return 0;
}