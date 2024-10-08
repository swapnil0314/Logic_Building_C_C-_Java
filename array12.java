/*Find the subarray with the maximum sum (Kadane’s Algorithm).
Merge two sorted arrays.
Find the missing number in an array of integers from 1 to n.
Find the duplicate number in an array of integers. */

import java.util.Arrays;

public class array12 {

    //Find the subarray with the maximum sum (Kadane’s Algorithm).
    public static void subArrayWithMaxSum(int arr[])
    {
        int n = arr.length;
        int pairSum = 0;
        int imax = Integer.MIN_VALUE;

        for(int i = 0 ; i<n ; i++)
        {
            for(int j=i+1 ; j<n ; j++ )
            {
                if (imax < arr[i]+arr[j]) 
                {
                    imax = arr[i]+arr[j];   
                }
            }
        }

        System.out.println("The maximum subarray is : "+imax);
    }

    //Merge two sorted arrays.
    public static void MergeSorted(int arr[], int arr1[])
    {
        int m = arr.length;
        int n = arr1.length;

        int mergedArr[] = new int[m+n];

        for(int i=0 ; i<m ; i++)
        {
            mergedArr[i] = arr[i];
        }

        for(int i=0 ; i<n ; i++)
        {
            mergedArr[m+i] = arr1[i];
        }

        Arrays.sort(mergedArr);

        System.out.println("The merged sorted array is : "+Arrays.toString(mergedArr));


    }


    //Find the missing number in an array of integers from 1 to n.
    public static void FindMissing(int arr[] , int n)
    {
        



        for(int i=0; i<n; i++)
        {
            boolean ifound = false;

            for(int j = 0 ; j<arr.length ; j++)
            {
                if (i == arr[j]) 
                {
                    continue;   
                }
                else if (i != arr[j]) 
                {
                    ifound = true;   
                }
            }

            if (ifound== true) 
            {
                 System.out.println("The missing number is : "+i);  
            }
            
        }

    }

    public static int FindDuplicate(int arr[])
    {
        for(int i=0 ; i<arr.length ; i++)
        {
            for(int j=i+1; j<arr.length ; j++)
            {
                if (arr[i] == arr[j]) 
                {
                    return i;   
                }
                
            }
        }


                
                    return -1;
                
    }
    public static void main(String[] args) {
        
          int arr[] = {2,3,4,8,4,3,5,6,7,8,4,1};

          //int arr1[] = {2,3,4,5 ,3,2,4,1,2,4,8,4,1,9};

          //int key = 7;
          //subArrayWithMaxSum(arr);

       // MergeSorted(arr,arr1);

      // FindMissing(arr , key);

      //FindDuplicate(arr);

      System.out.println("The duplicate in array is "+FindDuplicate(arr));
    }
    
}
