// Accept the standard from user and display that standards exam timing

#include<stdio.h>

void DisplayExamTime(int iStandard)
{
    switch (iStandard)
    {
        case 1 :
         printf("Your exam is at 8 Am\n");
        break;

         case 2 : 
        printf("Your exam is at 9 am\n");
        break;

        case 3:
        printf("Your exam is at 10 am\n");
        break;

        case 4:
        printf("Your exam is at 11 am\n");
        break;
    default:
        printf("Wrong input...\n");
        break;
    }
}

int main()
{
    auto int iValue = 0;

    printf("Enter your standard : \n");
    scanf("%d",&iValue);

    DisplayExamTime(iValue);

    return 0;
}