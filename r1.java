//print 1 to n using recursion

/**
 * r1
 */
public class r1 {

    public static void print(int n)
    {
       if (n > 0) 
       {
            print(n-1);
            System.out.print(n+" ");
       } 
       return;

    }

     public static void printRev(int n)
    {
       if (n > 0) 
       {
            System.out.print(n+" ");
            printRev(n-1);
       }
       return;

    }

    public static void printdec(int n)
    {
        if (n == 1) 
        {
           System.out.println(n);
           return; 
        }
        System.out.print(n+" ");
        printdec(n-1);

    }

    public static void printInc(int n)
    {
        if (n == 1) 
        {
            System.out.print(n+" "); 
            return;  
        }
        printInc(n-1);
        System.out.print(n+" ");
    }

    public static int factorial(int n)
    {
        if (n == 0) 
        {
            return 1;
        }
        int fnm1 = factorial(n-1);
        int fn = n * factorial(n-1);
        return fn;

    }

    public static int sum(int n)
    {
        if (n == 0) 
        {
            return 1;   
        }

        int Snm1 = sum(n-1);
        int sn = n+ Snm1;
        return sn;

    }

    public static void main(String[] args) {
        
        int n = 7;

        //print(n);printRev(n);
        //printdec(n);
        //printInc(n);
    //  System.out.println( factorial(n));

       System.out.println(sum(n));
    }
}