public class r7 {

    public static int LastOccurence(int arr[] , int key , int i)
    {
        if (i == arr.length) 
        {
            return -1;   
        }
        int isFound =  LastOccurence(arr, key, i+1);

        if (isFound == -1 && arr[i] == key) 
        {
            return i;   
        }

        return isFound;

    }



    public static void main(String[] args) {
        
        int arr[] = {1,2,3,4,5,6 , 5 , 7 , 8 , 6 , 4  , 4 , 2 , 3};
        int key = 4;
        

        System.out.println(LastOccurence(arr, key , 0));
    }
    
}