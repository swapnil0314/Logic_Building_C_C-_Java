// accept number from user and if the number is less than 50
// print small if greater than 50 and less than 100 print medium if greater 
// than 100 print large


#include<stdio.h>

void Number(int ino)
{
    if(ino<50)
    {
        printf("The number is small\n");
    }
    else if((ino>50)&&(ino<100))
    {
        printf("The number is medium\n");
    }
    else if (ino>100)
    {
        printf("The number is large\n");
    }

}

int main()
{
    int ivalue =0;
    printf("Enter number\n");
    scanf("%d",&ivalue);

    Number(ivalue);

    return 0;
}