// Write a program that reads a set of integers, and then prints the sum of the
//even and odd integers
import java.util.Scanner;

public class practice4 {

    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter how many number you want :  ");

        int number = sobj.nextInt();
        int iEvenSum =0;
        int iOddSum = 0;

        for(int i = 0 ; i<=number ; i++)
        {
            int ino = sobj.nextInt();

            if (ino % 2 == 0) 
            {
                iEvenSum = iEvenSum + ino;    
            }

            else
            {
                iOddSum = iOddSum+ino;
            }
        }

        System.out.println("The sum of even integers is : "+iEvenSum);

        System.out.println("The sum of even integers is : "+iOddSum);

    }
    
}
