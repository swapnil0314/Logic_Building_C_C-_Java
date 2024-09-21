public class array2 {

    public static void smallest(int arr[])
    {
        int large = arr[0];

        for(int i = 0 ; i < arr.length ; i++ )
        {
           
                if (arr[i] > large) 
                {
                       large = arr[i];
                }
            
        }
        System.out.println(large);
    }

    public static void main(String[] args) {

        int arr[] = {2 , 8 , 4 , 9 , 7 , 3 , 5 , 1 ,  0 , 7 , 6 , 12 , 18};

        smallest(arr);
        
    }
    
}
