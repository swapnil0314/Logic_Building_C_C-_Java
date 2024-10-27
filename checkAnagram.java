import java.util.Arrays;

public class checkAnagram {

    public static void checkAnagramm(ProblemStrEasy s , ProblemStrEasy s1)
    {
        char arr1 [] =  s.toCharArray();

        char arr2 [] =s1.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if (Arrays.equals(arr1, arr2)) {
            System.out.println("The Strings are in anagram ");
        }
        else
        {
            System.out.println("The strings are not in an anagram ");
        }


    }

    public static void main(ProblemStrEasy[] args) {
        
        ProblemStrEasy s = "racecar";

        ProblemStrEasy s1 = "aceracr";

        checkAnagramm(s,s1);
    }
    
}
