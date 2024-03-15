/*

Input :

Row : 3
Column : 5

output :
1  2  3  4  5  6
1  2  3  4  5  6
1  2  3  4  5   6
*/

#include<stdio.h>

void Display(int iRow , int iCol)
{
    int i = 0;
    int j = 0;

    for(i=1 ; i<=iRow ; i++)
    {
        for(j=1 ; j<=iCol ; j++)
        {
            printf("%d\t",j);
        }
        printf("\n");
    }

}
int main()
{
    int iValue1 = 0 , iValue2 = 0;

    printf("ENter the number of rows: \n");
    scanf("%d",&iValue1);

    printf("ENter the number of columns: \n");
    scanf("%d",&iValue2);

    Display(iValue1,iValue2);

    return 0;
}