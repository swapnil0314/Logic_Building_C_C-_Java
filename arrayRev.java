import java.util.Arrays;

public class arrayRev {

    //Reverse an array in place.

    public static void rev(int arr[])
    {
        int n = arr.length;
        int temp;

     for(int i=0 ; i<n/2; i++)
     {
        temp = arr[i];
        arr[i] = arr[n-i-1];
        arr[n-i-1] = temp;
        
     }

        System.out.println("The reversed array is : "+ Arrays.toString(arr));

    }
    public static void main(String[] args) {
        
        int arr[] = {3,5,2,7,9,2,4,6,8};

        rev(arr);

    }
    
}
