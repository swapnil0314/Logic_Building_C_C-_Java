/*Find the maximum product of two integers in an array.
Find the second largest element in an array.
Rotate an array by k positions.

 */


public class array11 {

    public static void secondLargest(int arr[])
    {
        int imax =Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;

        for(int i=0 ; i<arr.length; i++)
        {
            if (arr[i] > imax) 
            {
                smax = imax;
                imax = arr[i];
            }
            else if (arr[i] >= smax && arr[i]<= imax) 
            {
                smax= arr[i];
            }
        }

        System.out.println("The second largest number is : "+smax);
    }

    public static void rotateArray(int arr[],int key)
    {


    }


    public static void main(String[] args) {
        
        int arr[] = {2,3,4,8,7,4,1,3,5,6,7,8,4,1,9};

       // secondLargest(arr);

        rotateArray(arr,5);
    }
    
}
