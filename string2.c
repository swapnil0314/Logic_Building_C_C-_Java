
#include<stdio.h>

int main()
{
    int iCnt = 0;

    printf("Ascii Table\n");

    for(iCnt=0; iCnt<=127; iCnt++)
    {
        printf("%c\t%d\t",iCnt,iCnt);
    }

    return 0;
}