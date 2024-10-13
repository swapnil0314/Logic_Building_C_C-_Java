/*Write a program to sort an array using bubble sort.
Write a program to implement binary search on a sorted array.
Write a program to remove duplicates from an array.
Write a program to find the missing number in an array of size n.
Write a program to check if an array is sorted in ascending order.
Write a program to rotate an array by k positions.
Write a program to find the intersection of two arrays.
Write a program to find the maximum sum of a contiguous subarray (Kadane’s algorithm).
Write a program to transpose a matrix.
Write a program to perform matrix multiplication. */

public class ArrayAndMatrixManipulation {

    //Write a program to sort an array using bubble sort.
    public static void BubbleSort(int arr[])
    {
        int swap = 0;
        for(int turn =0; turn<arr.length-1 ; turn++)
        {
            for(int j=0 ; j<arr.length-1-turn ; j++)
            {
                
                if (arr[j] > arr[j+1]) 
                {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp; 
                    swap++; 
                }
            }
        }

        System.out.println("The number of swaps in the array were : "+swap);

    }

    public static void printArray(int arr[])
    {
        for(int i=0 ; i<arr.length ; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    //Write a program to implement binary search on a sorted array.
    public static void BinarySearchOnSorted(int arr[] ,  int key)
    {
        int start = 0;
        int n = arr.length;
        int mid = n/2;

        
             
        if (key > mid) 
        {
            start = mid+1;
            n = arr.length;
        }
        else{
            start = 0;
             n = mid;
        }

        for(int i=start ; i<n ; i++)
        {
            if (arr[i] == key) 
            {
                System.out.println("The key  "+arr[i]+" is present at "+i);   
            }
        }

    }

    public static int BinarySearchOnSortedd(int arr[] , int key)
    {
        int start = 0;
        int end = arr.length-1;


        while (start <= end ) 
        {
            int mid = start + (end - start) / 2;


            if (arr[mid] == key) 
            {
                return mid;   
            }

            if (arr[mid] < key) 
            {
                   start = mid+1;
            }
            else
            {
                end = mid-1;
            }

           
        }

        return -1;
    }

    public static int BinarySearchRecursive(int arr[] , int start , int end , int key)
    {
       if (start <= end) 
       {
            int mid = start + (end-start)/2 ;

            if (arr[mid] == key) 
            {
                 return mid;
            }

        if (arr[mid] < key) {
                BinarySearchRecursive(arr, mid+1 , end, key );
        }

        if (arr[mid] > key) 
        {
                BinarySearchRecursive(arr, start, mid-1, key);
        }


        }

        return -1;
    }

    public static void main(String[] args) {

        int arr[] = {5,10,3,4,5,8,1,7,6,1,2,3,7,8,9,12,4,5};

        int arrSorted[] = {3,4,5,6,7,8,9};
        int key = 8;
        
        int arrofdryrun[] = {1,5,6,3,4,2,7};
         BubbleSort(arrofdryrun);
        // printArray(arr);

        //BinarySearchOnSorted(arrSorted , key);

        // int result = BinarySearchOnSortedd(arrSorted , key);

        // if (result != -1) {
        //     System.out.println("The key " + key + " is present at index " + result);
        // } else {
        //     System.out.println("The key " + key + " is not present in the array.");
        // }

        // int result = BinarySearchRecursive(arrSorted , 0 , arr.length-1 ,  key);

        // if (result != -1) {
        //         System.out.println("The key " + key + " is present at index " + result);
        //      } else {
        //          System.out.println("The key " + key + " is not present in the array.");
        //      }


    }
    
}
