
//Find the largest Element in array 

import java.util.Arrays;

/**
 * LargestInArray
 */
public class ReverseAnArray {

    public static void Reverse(int arr[] )
    {


        for(int i=arr.length-1 ; i>=0 ; i--)
        {
            System.out.print(arr[i]+", ");
        }

       
    }

    public static void OReverse(int arr[])
    {
        int start = 0;
        int end = arr.length-1;

        while (start <= end) 
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            
            start++;
            end--;
        }

        System.out.println("The reversed array is : "+Arrays.toString(arr));
    }

    
    public static void main(String[] args) {
        
        int arr[] = {5,11,13,13,18,20,21,24,26,27,31,35,40,47,47,48,63,65,66,78,82,83,85,86,88,92,93,95,97,98};
        int key = 27;
        //Reverse(arr);

        OReverse(arr);
    }
}