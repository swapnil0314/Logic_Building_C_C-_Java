public class array6 {

    public static void printPairs(int numbers[])
    {
        for(int i = 0 ; i<numbers.length ; i++)
        {
            int curr = numbers[i];
            int tp= 1;

            for(int j = i+1 ; j<numbers.length ; j++)
            {
                System.out.print("("+curr+","+numbers[j]+")");
                tp++;
            }
            System.out.println();
            System.out.println("TOtal pairs ="+tp);
        }

    }
    
    public static void main(String[] args) {
        
        int numbers [] = {2,4,6,8,10};

        
        printPairs(numbers);
       
    }
    
}
