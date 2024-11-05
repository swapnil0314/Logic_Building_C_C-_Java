public class PairSUm {

    //Find the pair of numbers in an array that add up to a given sum.

    public static void PairSum(int arr[] , int sum)
    {
        int n = arr.length;

        for(int i=0 ; i<n; i++)
        {
            for(int j=i+1 ; j<n ; j++)
            {
                if (arr[i]+arr[j] == sum) 
                {
                    System.out.println("The pair is : "+"[ "+arr[i]+" , "+arr[j]+" ]");   
                }
            }
        }
    }

    public static void main(String[] args) {
        
        int arr[]= { 5,3,7,1,8,9,3,7,0,2,3,4};

        int sum = 12;

        PairSum(arr , sum);

    }
    
}
