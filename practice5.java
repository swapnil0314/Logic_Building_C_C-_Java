//Write a program to find the factorial of any number entered by the user
import java.util.Scanner;
public class practice5 {

    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);

        int num = sobj.nextInt();
        int ifact = 1;
        while (num != 0) 
        {
            ifact *= num;

            num -= 1;
        }

        System.out.println("The factorial is"+ifact);
    }
    
}
