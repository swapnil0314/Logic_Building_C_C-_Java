import java.util.Arrays;

public class PreFixSum {

    public static void maxSubArraySum(int arr[])
    {
        int n = arr.length;
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        int prefix [] = new int[n];

        prefix[0] = arr[0];

        for(int i=1 ; i<prefix.length; i++)
        {
            prefix[i] = prefix[i-1] + arr[i];
        }

        System.out.println(Arrays.toString(prefix));


        for(int i=0; i<n ; i++)
        {
            int start = i;

            for(int j=i; j<n ; j++)
            {
                int end = j;

                currSum = start ==0 ? prefix[end] : prefix[end] - prefix[start-1];
                if (maxSum < currSum) 
                {
                    maxSum = currSum;   
                }

            }
        }

        System.out.println("Max sum = " +maxSum);
    }

    public static void main(String[] args) {

        int arr[] = {1,-2,6,-1,3}; 

        maxSubArraySum(arr);
        
    }
    
}
