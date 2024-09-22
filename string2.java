import java.util.Scanner;

public class string2 
{

    public static void main(String[] args) {
        
        String s ;

        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter a String: ");

        s = sobj.nextLine();

        System.out.print("After string reverse ::       ");

        for(int i = s.length()-1; i >= 0 ; i--)
        {
            System.out.print(s.charAt(i));
        }
    }
    
}
