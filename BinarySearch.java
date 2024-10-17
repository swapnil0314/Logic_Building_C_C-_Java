
//Find the largest Element in array 

/**
 * LargestInArray
 */
public class BinarySearch {

    public static void BinarySearch(int arr[] , int key)
    {

        int end = arr.length-1;
        int start = 0;
        

        while (start < end) 
        {
            int mid = end / 2;


            if (arr[mid] == key) 
            {
                System.out.println("The key "+key+"is at index "+mid);   
            }
            else
            {
                start = mid+1;
            }

            start++;
            end--;
            
        }

       
    }

    
    public static void main(String[] args) {
        
        int arr[] = {5,11,13,13,18,20,21,24,26,27,31,35,40,47,47,48,63,65,66,78,82,83,85,86,88,92,93,95,97,98};
        int key = 27;
        BinarySearch(arr , key);
    }
}