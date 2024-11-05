import java.util.HashSet;
import java.util.Set;

public class RemoveCharacters {

    public static String removeCharacters(String str, String charsToRemove) {
        // // Convert charsToRemove to a HashSet for efficient lookup
        // Set<Character> removeSet = new HashSet<>();
        // for (char c : charsToRemove.toCharArray()) {
        //     removeSet.add(c);
        // }

        // // Use StringBuilder to build the resulting string
        // StringBuilder result = new StringBuilder();
        // for (char c : input.toCharArray()) {
        //     if (!removeSet.contains(c)) {
        //         result.append(c);
        //     }
        // }
        
        // return result.toString();


        Set<Character> removeSet = new HashSet<>();
        for(char c : charsToRemove.toCharArray())
        {
            removeSet.add(c);
        }

        StringBuilder result = new StringBuilder();
        for(char c : str.toCharArray())
        {
            if (!removeSet.contains(c)) 
            {
                result.append(c);   
            }
        }

        return result.toString();

    }

    public static void main(String[] args) {
        String input = "hello world";
        String charsToRemove = "ol";
        
        String result = removeCharacters(input, charsToRemove);
        System.out.println("Result: " + result);  // Output: "hll wrld"
    }
}
