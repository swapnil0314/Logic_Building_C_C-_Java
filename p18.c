// Accept number from user and print that number of even numbers on screen 


#include<stdio.h>

void Display(int ino)
{
    int iCnt = 0;
    int i = 0;

    while (iCnt<=ino)
    {
        if((i % 2)==0)
        {
            printf("%d\t",i);
        }
        i = i + 2;
        iCnt++;
    }

}


int main()
{
    int ivalue = 0;

    printf("how many even numbers do you want : \n");
    scanf("%d",&ivalue);

    Display(ivalue);

    return 0;
}