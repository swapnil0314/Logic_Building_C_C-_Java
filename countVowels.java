import java.util.Scanner;

public class countVowels {

    public static void checkVowels(ProblemStrEasy s)
    {
        int n = s.length();
        int icount = 0;

        for(int i=0; i<n ; i++)
        {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u'  ) 
            {
                icount++;
            }
        }

        System.out.println("There are "+icount+"  number of vowels in the string...");

}


    public static void main(ProblemStrEasy[] args) {
        
       

        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the String to check the number of vowels in it: ");
        ProblemStrEasy s =  sobj.nextLine();

        checkVowels(s);

    }
    
}
