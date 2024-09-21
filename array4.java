//How to reverse a String in java? Can you write a program without using any java inbuilt methods?

public class array4 {


    public static void main(String[] args) {
        
        String originalString = "HelloWOrld";

        char [] charArray = originalString.toCharArray();

        String reversedString = "";

        for(int i = charArray.length-1 ; i >= 0; i--)
        {
            reversedString += charArray[i];
        }


        System.out.println("Original String: "+originalString);

        System.out.println("Reversed String: "+reversedString);
    }
    
}
