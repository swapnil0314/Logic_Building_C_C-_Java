/*args
 * Find the maximum product of two integers in an array.
Find the second largest element in an array.
Rotate an array by k positions.
Find the subarray with the maximum sum (Kadane’s Algorithm).
Merge two sorted arrays.
Find the missing number in an array of integers from 1 to n.
Find the duplicate number in an array of integers.
Move all zeroes to the end of an array.
Find the common elements between two arrays.
Find the number of pairs in an array that sum to a specific target.


in java how many ways we can solve the above problem statement
 give brute force to optimized code with solution

 */

import java.util.Arrays;

public class array10 {


    //Find the maximum product of two integers in an array.
    public static void MaxofTwo(int arr[])
    {
        int imax = Integer.MIN_VALUE;
        int n = arr.length;

        for(int i=0 ; i<n ; i++)
        {
            for(int j=i+1 ; j<n ; j++)
            {
              int  isum = arr[i]*arr[j];

              if (isum>imax) 
              {
                imax = isum; 
              }
            }
        }

        System.out.println("The maximum of Two in array is : "+imax);
    }

    public static void MaxofTwoo(int arr[])
    {

        Arrays.sort(arr);

        int n = arr.length;

        System.out.println(Math.max(arr[0]*arr[1] , arr[n-1]*arr[n-2]));


    }

    public static void MaxofTwooo(int arr[])
    {
        int imax1 = Integer.MIN_VALUE , imax2=Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE , min2=Integer.MAX_VALUE;


        for(int num : arr)
        {
            //largest numbers
            if (num > imax1) 
            {
                imax2 = imax1;
                imax1 = num;   
            }
            else if (num > imax2) 
            {
                imax2 = num;   
            }

            //smalles numbers 
            if (num < min1) 
            {
                min2 = min1;
                min1 = num;   
            }
            else if (num < min2) 
            {
                min2 = num;   
            }
        }

        System.out.println(Math.max(imax1*imax2, min1*min2)); 

    }

    public static void secondLargest(int arr[])
    {
        int imax1 = Integer.MIN_VALUE , imax2 = Integer.MIN_VALUE;

        for(int i=0 ; i<arr.length ; i++)
        {
            if (arr[i] > imax1) 
            {
                imax2 = imax1;
                imax1 = arr[i];   
            }
            else if (arr[i] > imax2 && arr[i] < imax1) 
            {
                imax2 = arr[i];   
            }
        }

        System.out.println("The second largest element is  "+imax2);


    }

    //Rotate an array by k positions.

    public static void RotateByK(int arr[] , int key)
    {   

        int n = arr.length;

        key = key % n;

        for(int i = 0 ; i<key ; i++)
        {
            rotateOnce(arr);
        }
    }

    public static void rotateOnce(int [] arr)
    {

            int n = arr.length;

            int last = arr[n-1];

            for(int i=n-1 ; i>0 ; i--)
            {
                arr[i] = arr[i-1];
            }

            arr[0] = last;

            System.out.println(Arrays.toString(arr));

        
        
    }

    public static void rotateWithExtraSpace(int arr[] , int k)
    {
        int n = arr.length;

        int temp[] = new int[n];

        for(int i=0 ; i<n ; i++)
        {
            temp[(i+k) % n] = arr[i];
        }

        for(int i=0 ; i<n; i++)
        {
            arr[i] = temp[i];
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void rotateByReversing(int arr[] , int k)
    {
        int n=arr.length;

        k = k%n ;   //handles cases where k>n

        //step 1- Reverse the entire array
        reverse(arr , 0 , n-1);

        //step 2- Reverse the first k elements
        reverse(arr, 0, k-1);

        //step 3- Reverse the remaining elements
        reverse(arr,k,n-1);
    }

    public static void reverse(int arr[] , int start , int end)
    {
        while (start < end) 
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;   
        }
    }


    public static void main(String[] args) {
        
        int arr[] = {2,7,9,4,5,9,0,2,7};

       // MaxofTwo(arr);    //Linear
      // MaxofTwoo(arr);    //sorting
        //MaxofTwooo(arr);     //Linear Scan

       // secondLargest(arr);

      // RotateByK(arr , 4);
      //rotateWithExtraSpace(arr , 3);
      rotateByReversing(arr,3);

    }
    
}
