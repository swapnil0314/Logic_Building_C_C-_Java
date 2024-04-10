public class Pattern6 
{
    public static void Print(int ino)
    {
        //for spaces
      for(int i = 0 ; i<ino ; i++)
      {
        for(int j = 0 ; j<ino-i-1 ; j++)
        {
            System.out.print(" ");
        }
        

        for(int j = 0 ; j< 2*i+1 ; j++)
        {
            System.out.print(j);
        }

        for(int j = 0 ; j<ino-i-1 ; j++)
        {
            System.out.print(" ");
        }
      
        System.out.println( );

        }

    }

    public static void main(String[] args) 
    {
        int ino = 7;

        Print(ino);
        
    }
    
}
