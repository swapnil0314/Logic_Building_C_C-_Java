
// count number of 'z' inthe string

// Accept sting and count number of white dpaces

// uer of our function
#include<stdio.h>

int strlenSpace(char *str)
{
    int iCnt = 0;

    while(*str != '\0')
    {
        if((*str == ' ')||(*str == 'z')||(*str =='Z'))

    {
       iCnt++; 
    }  
    str++;

    }
    return iCnt;
}


int main()
{
    char Arr[40];
    int iRet = 0;


    printf("Enter string : \n");
    scanf("%[^'\n']s",Arr);   // Syntax for printing string with white space
 
    iRet = strlenSpace(Arr);

    printf("number of Spaces and char z is %d",iRet);

    

   

    return 0;

}
