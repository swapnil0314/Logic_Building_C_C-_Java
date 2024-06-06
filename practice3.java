import java.util.Scanner;

public class practice3 
{
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);

        do{
            System.out.println("Enter your number ");
            int n = sobj.nextInt();
            if (n % 10 == 0) {
                break;
            }
            System.out.println(n);
        }
        while(true);

    }
    
}
