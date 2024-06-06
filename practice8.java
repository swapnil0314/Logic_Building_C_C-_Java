public class practice8 {


    public static void Triangle(int n)
    {
            for(int i = 1 ; i<=n ; i++)
            {
                for(int j = 0; j<i ; j++)
                {
                    {
                        System.out.print((i+j)%2 );
                    }
                  
                    
                    
                }
                System.out.println();
            }
    }

    public static void main(String[] args) 
    {
        int r = 4;
        //int c = 4;
        Triangle(r);
        
    }
    
}
