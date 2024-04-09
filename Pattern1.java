
/**
 * Pattern1
 */


public class Pattern1 

{

    public static void Print(int ino)
    {
        for(int i = 1 ; i<=ino ; i++)
        {
            for(int j = 1 ; j<=i ; j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }


    }

    public static void main(String[] args) 
    {
        int ino = 7;

        Print(ino);
        
    }
    
}