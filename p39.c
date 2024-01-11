// accept number from user and display its table in reverse order.
#include<stdio.h>

void Display(int ino)
{
    int i =0;

    for(i=10 ; i>0 ; i--)
    {
        printf("%d\t",ino*i);
    }
    
}
int main()
{
    int ivalue = 0 ;

    printf("Enter number\n");
    scanf("%d",&ivalue);

    Display(ivalue);

    return 0;
    
}