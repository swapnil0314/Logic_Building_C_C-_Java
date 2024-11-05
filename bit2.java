public class bit2 {

    public static void oddOREven(int n)
    {
        int bitMast = 1;

        if ((n & bitMast ) == 0) 
        {
            //even number 
            System.out.println("The number is even");   
        }
        else
        {
            System.out.println("Odd number");
        }


    }

    public static void main(String[] args) {
        
        oddOREven(3);
        oddOREven(4);
        oddOREven(11);

    }
    
}
