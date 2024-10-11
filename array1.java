/*Find the minimum and maximum element in an array.
Reverse an array.
Find the Kth largest/smallest element in an array.
Move all zeroes to the end of the array while maintaining the order of other elements.
Find the duplicate number in an array containing numbers from 1 to N.
Find the missing number in an array containing numbers from 1 to N.
Merge two sorted arrays without using extra space.
Rotate an array by K positions (left/right).
Remove duplicates from a sorted array.
Find the intersection of two arrays. */

import java.util.ArrayList;
import java.util.Arrays;

public class array1 {

    

    public static void reverseAnArray(int arr[])
     {
         int n=arr.length;
    //     // int rev[] = new int[n];

    //     for(int i=n-1 ; i>=0 ; i--)
    //     {
    //        System.out.print(arr[i]+",");
    //     }

    //     // System.out.println(Arrays.toString(rev));

        int left = 0;
        int right = n-1;

        while (left < right) 
        {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;


            left++;
            right--;
        }

        System.out.println("The reversed array is : "+Arrays.toString(arr));

    }

    
    public static void kLargest(int arr[] , int K)
    {
        int n = arr.length;
        Arrays.sort(arr);

        System.out.println("The k largest element in the array is : "+arr[n-K]);
        
    }

    
    public static void ksmallest(int arr[] , int K)
    {

        int n = arr.length;
        Arrays.sort(arr);

        System.out.println("The k smallest element in the array is : "+arr[K-1]);
        
    }

    
    public static void moveZeroes(int arr[])
    {
        int n = arr.length;
        // Arrays.sort(arr);
       
        // int left = 0;
        // int right = n-1;

        // while (left < right) 
        // {
        //     int temp = arr[left];
        //     arr[left] = arr[right];
        //     arr[right] =  temp;
            
        //     left++;
        //     right--;
        // }

        // System.out.println("The array with zeroes is : "+Arrays.toString(arr));

        int j=0;

        for(int i=0 ; i<n; i++)
        {

            if (arr[i] != 0) 
            {
                 arr[j] = arr[i];
                 j++;  
            }
        }

        while (j < n) 
        {
            arr[j] = 0;  
            j++; 
        }

        System.out.println(Arrays.toString(arr));
        
    }

    
    public static void findDuplicate(int arr[])
    {

        ArrayList<Integer> k = new ArrayList<>();
        int n = arr.length;
        
        for(int i=0; i<n ; i++)
        {
            for(int j=i+1; j<n ; j++)
            {
                if (arr[i] == arr[j]) 
                {
                   k.add(arr[i]);
                }
            }
        }
        System.out.println("The repeated elements in the array are : "+k.get(k.size()-1));
        
        
    }

    public static void main(String[] args) {
        int arr[]= {3, 5 , 8 , 0 , 9 , 7 , 5 , 0 , 3 , 4 , 6 , 0 , 7 , 1};
        int key = 3;

        //reverseAnArray(arr);

        //kLargest(arr , key);

        //ksmallest(arr , key);

       // moveZeroes(arr);

        findDuplicate(arr);
    }
    
}
