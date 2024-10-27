

/**
 * StringPalindrome
 */
public class StringPalindrome {

    public static void checkStringPalindrome(ProblemStrEasy s)
    {
        int n = s.length();

        for(int i=0 ; i<n/2 ; i++)
        {
            if (s.charAt(i) == s.charAt(n-i-1)) 
            {
                continue;
            }
            else
            {
                System.out.println("The String   "+s+"  is not a palindrome");
                break;
            }
        }

        System.out.println("The String   "+s+"  is a palindrome");
    }

    public static void main(ProblemStrEasy[]args)
    {

        ProblemStrEasy s = "newyork";

        ProblemStrEasy s1 = "peeeeeeeeeeeeep";

        checkStringPalindrome(s);
        checkStringPalindrome(s1);

    }

    
}