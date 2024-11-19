public class r2 {

    public static void printAsc(int n)
    {
        if (n == 1) 
        {
            System.out.println(1); 
            return; 
        }

        printAsc(n-1) ;
        System.out.println(n+" ");
        
    }

    public static void main(String[] args) {
        
        int n = 10 ;
        //printAsc(n);
    printAsc(n);
    }
    
}
