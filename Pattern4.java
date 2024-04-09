
public class Pattern4 
{

    public static void Print(int ino)
    {
       for(int i = ino ; i>0 ; i--)
       {
        for(int j = 1 ; j <= i ; j++)
        {
            System.out.print(" * ");
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
