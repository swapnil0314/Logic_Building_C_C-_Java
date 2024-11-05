public class missingNumber {

    public static int findMissingNumber(int arr[] , int n)
    {
        //to find the sum 

        int expected = n*(n+1)/2 ;
        int actualSum = 0;

        for(int num : arr)
        {
            actualSum += num; 
        }

        return expected-actualSum;

    }



    public static void main(String[] args) {
        int[] nums = {1, 2, 4, 5, 6}; // Example array
        int n = 6; // Specify the range from 1 to n

        int missingNumber = findMissingNumber(nums, n);
        System.out.println("The missing number is: " + missingNumber);
    }
    
}
