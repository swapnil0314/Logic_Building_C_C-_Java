public class array7 {


    public static void subArray(int numbers[])

    {
        int ts = 0 ;
        
        for(int i = 0 ; i<numbers.length; i++)
        {
            
            int start = i;
            for(int j = i ; j<numbers.length ; j++)
            {
                int end = j;
                int isum=0;
                for(int k = start ; k<=end ; k++)
                {
                    System.out.print(numbers[k]+" ");
                    isum = numbers[k]+isum;
                    
                }
                System.out.print("The sum of the array is "+isum);
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total subarrays = "+ts);

        System.out.println();
    }


    public static void main(String[] args) {
        
        int numbers [] = {2,4,6,8,10};

        
        subArray(numbers);
       
    }
    
}
