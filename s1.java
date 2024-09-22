
/**
 * s1
 */
public class s1 {

    public static boolean isPalindrome(String str)
    {
        for(int i=0; i<str.length()/2 ; i++)
        {
            int n = str.length();
            if (str.charAt(i) != str.charAt(n-1-i)) 
            {
                return false;   
            }
            
        }
        return true;
    }

    public static float getSHortestPath(String path)
    {
        int x=0 , y =0 ;

        for(int i=0; i<path.length() ; i++)
        {
            char dir = path.charAt(i);

            //south
            if (dir == 'S') 
            {
                y--;   
            }
            else if (dir == 'N') 
            {
                y++;   
            }
            else if (dir == 'W') 
            {
                x--;    
            }
            else
            {
                x++;
            }
        }

        int X2 = x*x;
        int Y2 = y*y;

        return (float)Math.sqrt(X2+Y2);

    }

    public static void main(String[] args) {
        String str = "WNEENESENNN";

        System.out.println(getSHortestPath(str));
       
    }
}