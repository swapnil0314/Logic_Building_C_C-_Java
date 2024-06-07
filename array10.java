public class array10 
{
    public static void printSubArrays(int numbers[])
   {
    int largestSum = 0 ;
        for(int i = 0 ; i < numbers.length ; i++)
        {
           
           int  istart = i; 
            for(int j = i ; j < numbers.length ; j++)
            {
                int iend = j;
                int isum =0; 
                for(int k = istart ; k<= j ; k++)
                {
                    System.out.print(numbers[k]+" ");
                    isum = isum +numbers[k];
                }
                System.out.println("The sum of the array is : "+isum);
                System.out.println();
                if (largestSum < isum) 
                {
                    largestSum = isum;   
                }

            }
            System.out.println();
        }
        System.out.println("The largest sum is : "+largestSum);
   }

    public static void main(String[] args) {
        int numbers [] = {2,4,6,8,10};

        printSubArrays(numbers);
    }
    
}
