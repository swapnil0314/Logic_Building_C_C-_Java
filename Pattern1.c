// Input : 7
// Output : # # # # # #  #

// Input : 3
// Output : # # # 

#include<stdio.h>

void Display(int iNo)
{
    int iCnt = 1;

    for(iCnt = 1; iCnt <= iNo; iCnt++)
    {
        printf("#\t");
    }
    printf("\n");
    

}
int main()
{
    int iFrequency = 0;

    printf("ENter the frequency of Symbol : \n");
    scanf("%d",&iFrequency);

    Display(iFrequency);

    return 0;
}