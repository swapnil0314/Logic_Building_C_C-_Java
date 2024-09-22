public class s7 {

    public static String sbuilder(String str)
    {
        StringBuilder newStr = new StringBuilder();

        int n = str.length();

        for(int i=0 ; i<n; i++)
        {
            Integer count = 1;

            while (i < n-1 && str.charAt(i) == str.charAt(i+1)) 
            {
                count++; 
                if (count > 1) {
                    newStr.append(count);
                }
                i++;            
            }
          
        }

        return newStr.toString();
    }

    public static void main(String[] args) {
        
        String str = "aaabbcccdd";

        System.out.println(sbuilder(str));

    }
    
}
