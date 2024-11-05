public class countOccurrence {

    public static void countO(String str)
    {
        int icount = 0;
        int imax = Integer.MIN_VALUE;

        for(int i=0 ; i<str.length() ; i++)
        {
            for(int j=i+1 ; j<str.length() ; j++)
            {
                if (str.charAt(i) == str.charAt(j))
                {
                    icount++; 
                     
                }
                
            }
            if (icount > imax) 
                {
                    imax = icount;
                        
                }
            
        }

        System.out.println("The character is occurred "+icount+" times in the string");
    }
    public static void main(String[] args) {

        String str = "bookmyshow";

        countO(str);
    }
    
}
