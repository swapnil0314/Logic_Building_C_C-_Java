/*

Input :

Row : 3
Column : 5

output :
a  b  c  d  e  f 
a  b  c  d  e  f
a  b  c  d  e  f
*/



#include<stdio.h>

void Display(int iRow , int iCol)
{
    int i = 0;
    int j = 0;
    char ch = '\0';

    for(i=1  ; i<=iRow ; i++)
    {
        for(j=1, ch ='a' ; j<=iCol ; ch++ ,  j++)
        {
            printf("%c\t",ch);
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