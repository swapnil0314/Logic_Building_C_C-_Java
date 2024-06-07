public class array9 {

    public static void subArray(int numbers[])
    {
        int istart = 0 , iend = numbers.length - 1 ;
      
        while (istart < iend) 
        {
            int temp = numbers[iend];
            
            numbers[iend] = numbers[istart];
            numbers[istart] = temp;

            istart++;
            iend--;
            
        } 
    }

    public static void main(String[] args) {
        
        int numbers [] = {2,4,6,8,10};

        subArray(numbers);

        for(int i = 0 ; i< numbers.length ; i++)
        {
            System.out.print(numbers[i]+" ");
        }
       System.out.println();
       
    }
    
}
