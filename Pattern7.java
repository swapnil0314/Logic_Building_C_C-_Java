public class Pattern7 
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
        
        char ch = 'A';
        for(int j = 0; j< 2*i+1 ; j++,ch++)
        {
            System.out.print(ch);
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
