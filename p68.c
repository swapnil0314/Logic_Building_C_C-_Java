#include<stdio.h>

void Pattern(int iRow , int iCol)
{
    int i = 0 , j = 0 ;
    char chs ='\0';
    char ch ='\0';
    
    
    for(i=iRow ; i>0 ; i--)
    {
        for(j=1 ; j<=iCol ; j++)
        {
            printf("%d\t",i);
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