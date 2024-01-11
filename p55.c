// accept n numbers from user and return diff between summation of even 
// and summation of odd elements

#include<stdio.h>

int Difference(int Arr[int iSize],int iLength)
{
    int iSumEven = 0 , iSUmOdd= 0 , idiff = 0,  i = 0;


    if((Arr[i] % 2)==0)
    {
        iSumEven = iSumEven+ Arr[6];
    }
    else if((Arr[i] % 2)!=0)
    {
        iSUmOdd = iSUmOdd + Arr[6];
    }

    idiff = iSumEven-iSUmOdd;


    return idiff;

}

int main()
{
    int iSize = 0 , iRet = 0, iCnt = 0 , iLength = 0,  i = 0;
    int *p = NULL;
    
    printf("Enter number of elements\n");
    scanf("%d",&iSize);

    p = (int*)malloc(iSize * sizeof(int));

    if(p == NULL)
    {
        printf("Unable to allocate memory\n");
        return -1;
    }
    else
    {
    printf("Enter %d elements ",iLength);
    
    for(iCnt = 0; iCnt<iLength ; iCnt++)
    {
        printf("Enter element: %d",iCnt+1);
        scanf("%d",&p[iCnt]);
    }
    }
    iRet = Difference(p,iSize);

    printf("Result is %d",iRet);

    free(p);
    return 0;
}