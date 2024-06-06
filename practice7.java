public class practice7 {
   
    public static void floydsTriangle(int n)
    {
        int icnt = 1;
            for(int i = 1 ; i<=n ; i++)
            {
                for(int j = 0; j<i ; j++)
                {
                    System.out.print(icnt);
                    icnt++;
                }

                System.out.println();
            }
    }

    public static void main(String[] args) 
    {
        int r = 4;
        //int c = 4;
        floydsTriangle(r);
        
    }
    
}
