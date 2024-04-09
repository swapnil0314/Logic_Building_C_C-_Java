public class Pattern5 
{
    
    public static void Print(int ino)
    {
    
        for(int i = 1 ; i<=ino ; i++)
        {
            char c = 'A';
            for(int j = 1  ; j<=i ; j++ , c++)
            {
                System.out.print(c+" ");
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
