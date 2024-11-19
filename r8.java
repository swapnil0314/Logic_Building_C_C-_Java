public class r8 {

    public static int FirstO(int arr[] , int key , int i)
    {
        if (i == arr.length-1) 
        {
            return -1;   
        }

        if (arr[i] == key) 
        {
          return i;   
        }

        return FirstO(arr,key,i+1);
    }


    public static void main(String[] args) {
        
        int arr[] = {1,2,3,4,5,6 , 5 , 7 , 8 , 6 , 4  , 4 , 2 , 3};
        int key = 7;
        

        System.out.println(FirstO(arr, key , 0));
    }
    
}
