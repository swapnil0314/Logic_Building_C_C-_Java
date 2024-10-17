
//Find the largest Element in array 

/**
 * LargestInArray
 */
public class LargestInArray {

    public static void FindLargest(int arr[])
    {

        int n = arr.length;
        int imax = Integer.MIN_VALUE;

        for(int i=0 ; i<n ; i++)
        {
            if (arr[i] > imax) 
            {   
                imax = arr[i];
            }
        }

        System.out.println("The maximum of the array is "+imax);
    }

    
    public static void main(String[] args) {
        
        int arr[] = {21, 11, 29, 97, 66, 10, 6, 10, 19, 85, 13, 73, 69, 70, 87, 74, 59, 2, 13, 53, 14};

        FindLargest(arr);
    }
}