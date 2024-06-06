public class practice9 {


    public static void Butterfly(int n)
    {
            for(int i = 1 ; i<=n ; i++)
            {

                //for stars 
                for(int j = 1; j<= i ; j++)
                { 
                        System.out.print("*");               
                }
                 //for spaces 

                 for(int j = 1; j<= (2 * (n - i)) ; j++)
                 {
                    System.out.print(" ");
                 }

                 //for stars
                 for(int j = 1; j<= i ; j++)
                { 
                        System.out.print("*");               
                }
                System.out.println();
            }

            for(int i = n ; i>=1; i--)
            {

                //for stars 
                for(int j = 1; j<= i ; j++)
                { 
                        System.out.print("*");               
                }
                 //for spaces 

                 for(int j = 1; j<= (2 * (n - i)) ; j++)
                 {
                    System.out.print(" ");
                 }

                 //for stars
                 for(int j = 1; j<= i ; j++)
                { 
                        System.out.print("*");               
                }
                System.out.println();
            }
    }

    public static void main(String[] args) 
    {
        int r = 5;
        
        Butterfly(r);
        
    }
    
}
