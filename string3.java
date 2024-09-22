//Write a java program to check if two Strings are anagram in java?

import java.util.Arrays;

public class string3 
{

    public static boolean areAnagrams(String s1 , String s2)
    {
        char [] charArray1 = s1.toCharArray();
        char[] charArray2 = s2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1, charArray2);
    }
    public static void main(String[] args) {
        
        String s1 = "listen";
        String s2 = "silent";

        if (areAnagrams(s1 , s2)) 
        {
            System.out.println("True");   
        }
        else
        {
            System.out.println("False");
        }

        s1 = "gram";
        s2="arm";

        if (areAnagrams(s1 , s2)) 
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }   
}
