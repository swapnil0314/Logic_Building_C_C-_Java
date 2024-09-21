//find the smalles number in an array 
public class array1{

    public static void smallest(int arr[])
    {
        int ismall = arr[0];
        for(int i = 0 ; i < arr.length ; i++ )
        {
           
                if (arr[i] < ismall) 
                {
                    ismall = arr[i];   
                }
            
            
        }
        System.out.println(ismall);   
    }
    public static void main(String[] args) {

        int arr[] = {2 , 8 , 4 , 9 , 7 , 3 , 5 , 1 ,  0 , 7 , 6 , 12 , 18};

        smallest(arr);
        
    }



}