public class Repeat {

    public static boolean Duplicate(int arr[])
    {

        int n  = arr.length;

        int val = 0;

        for(int i=0; i<n ; i++)
        {
            val=arr[i];

            for(int j=i+1 ; j<n ; j++)
            {
                if (val == arr[j]) 
                {
                    return true;   
                }
            }
        }

        return false;
    }


    public static void main(String[] args) {
        
        int arr[] = {1,2,3,4,5 , 1};

       boolean result =  Duplicate(arr);

        System.out.println(result);
    }
    
}
