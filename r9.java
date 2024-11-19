public class r9 {

    public static int Power(int n , int p)
    {

        if (p == 0) {
            return 1;
        }

        int pnm1  = Power(n, p-1);
        int pow = n * pnm1;
        return pow;
    }


    public static void main(String[] args) {
        
      

        System.out.println(Power(2,10));
    }
    
}
