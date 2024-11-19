public class r6 {

    public static int firstOccurence(int arr[] , int key , int i)
    {

        if (i == arr.length) 
        {
            return -1;   
        }

        if (arr[i] == key) 
        {
            return i;   
        }

        return firstOccurence(arr, key, i+1);
    }



    public static void main(String[] args) {
        
        int arr[] = {1,2,3,4,5,6 , 5 , 7 , 8 , 6 , 4  , 4 , 2 , 3};
        int key = 4;
        

        System.out.println(firstOccurence(arr, key , 0));
    }
    
}
