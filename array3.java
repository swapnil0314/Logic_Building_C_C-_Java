public class array3 {

    public static int Largest(int numbers[])
    {
       // int imax = 0;
        int imin = Integer.MAX_VALUE;

        // for(int i = 0 ; i<numbers.length ; i++)
        // {
        //     if (numbers[i] > imax ) {
        //         imax=numbers[i];
        //     }
        // }
        // return imax;

        for(int i = 0 ; i<numbers.length ; i++)
        {
            if (numbers[i] < imin) 
            {
                imin=numbers[i]  ; 
            }
        }
        return imin;
    }

    public static void main(String[] args) {
        
        int numbers[] = {2,4,6,8,10,12,14,16};
        

        int index = Largest(numbers); 
        {
            System.out.println("THe key is at index  "+index);
        }
    }
    
}
