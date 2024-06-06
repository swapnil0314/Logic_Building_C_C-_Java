import java.util.Scanner;

public class practice1 {

    public static void main(String[] args) {
        
        System.out.println("Enter the number : ");
        Scanner sobj = new Scanner(System.in);
       int number = sobj.nextInt();

       if (number > 0) 
       {
            System.out.println("Number is positive");
       }
       else
       {
       
            System.out.println("Number is negative");
       
       }
    }
    
}
