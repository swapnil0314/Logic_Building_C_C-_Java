//Compress a string (e.g., "aabbcc" → "a2b2c2")


public class StrCompress {

    public static void Compress(String str)
    {
        int n = str.length();

        StringBuilder compressed = new StringBuilder();

        int i=0; 

        while (i<n) 
        {
            char currChar = str.charAt(i);
            int icount = 1;

            while (i+1 < n && currChar==str.charAt(i+1)) 
            {
                icount++;
                i++;   
            }

            compressed.append(currChar).append(icount);
            i++;

        }

        System.out.println(compressed.toString());

    }

    public static void main(String[] args) {
        
        String str = "aabbcc";

        Compress(str);
    }
}