public class practice12
{
    public static void NumPyramid(int n)
    {
            for(int i = 1 ; i<=n ; i++)
            {

                //spaces
                for(int j = 1 ; j<= (n-i) ; j++)
                {
                    System.out.print(" ");
                }

                for(int j = 1 ; j<= ((2*i)-1) ; j++)
                {
                   System.out.print(i);       
                }
                System.out.println();
            }

           
        
    }

    public static void main(String[] args) 
    {
        int r = 5;
        
        NumPyramid(r);
        
    }
    
}
