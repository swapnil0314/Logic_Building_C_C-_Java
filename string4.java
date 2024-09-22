import java.util.HashMap;

public class string4 

{

    public static boolean areAnagrams(String str1 , String str2)
    {

        if (str1.length() != str2.length()) 
        {
            return false;
        }

        HashMap<Character, Integer> charCount = new HashMap<>();

        for(char c : str1.toCharArray())
        {
            charCount.put(c, charCount.getOrDefault(c,0) + 1);
        }

        for(char c : str2.toCharArray())
        {
            if (!charCount.containsKey(c) || charCount.get(c) == 0) {

                return false;
            }
            charCount.put(c, charCount.get(c)-1);
        }

    }

    public static void main(String[] args) 
    {

        String str1 = "listen";
        String str2 = "silent";

        if (areAnagrams(str1, str2)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        str1 = "gram";
        str2 = "arm";

        if (areAnagrams(str1, str2)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        
    }
    
}
