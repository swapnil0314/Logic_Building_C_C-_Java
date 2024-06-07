public class array8 {


    public static void subArray(int numbers[])
    {
        int imax = 0 ; 

        for(int i = 1 ; i < numbers.length ; i++)
        {
            if (imax<numbers[i]) 
            {
                imax=numbers[i] ;  
            }
        }
        System.out.println("The largest number is : "+imax);
       
    }

    public static void main(String[] args) {
        
        int numbers [] = {2,4,6,8,10};

        subArray(numbers);
       
    }
    
}
