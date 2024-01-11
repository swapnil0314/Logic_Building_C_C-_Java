// accept single digit number from user and print it into word

#include<stdio.h>

void Display(int ino)
{
    if(ino==1)
    {
        printf("one\n");
    }
     else if (ino==2)
    {
        printf("two\n");
    }
      else if (ino==3)
    {
        printf("three\n");
    }
      else if (ino==4)
    {
        printf("four\n");
    }
      else if (ino==5)
    {
        printf("five\n");
    }
      else if (ino==6)
    {
        printf("six\n");
    }
      else if (ino==7)
    {
        printf("seven\n");
    }
      else if (ino==8)
    {
        printf("eight\n");
    }
      else if (ino==9)
    {
        printf("nine\n");
    }
     
    
    


}

int main()
{
    int ivalue =0;
    printf("Enter number\n");
    scanf("%d",&ivalue);

    Display(ivalue);

    return 0;
}