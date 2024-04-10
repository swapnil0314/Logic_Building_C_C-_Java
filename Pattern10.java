public class Pattern10 
{
    public static void Print(int ino)
    {
        for(int i = ino ; i > 0 ; i--)
        {
            for(int j =1 ; j<=i ; j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        for(int i = 0 ; i <= ino ; i++)
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
