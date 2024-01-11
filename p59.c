// accept num of rows and num of columns from user and display below pattern

#include<stdio.h>

void Pattern(int iRow , int iCol)
{
    int i = 0 , j = 0 ;
    for(i= 1  ; i<=iRow ; i++ )
    {
        for(j=1 ; j<=iCol ; j++)
        {
            printf("*\t");
        }
        printf("\n");
    }

}

int main()
{
int ivalue1 = 0 , ivalue2 = 0;


    printf("Enter num of rows and columns");
    scanf("%d %d",&ivalue1, &ivalue2);

    Pattern(ivalue1 , ivalue2);

    return 0 ;
}