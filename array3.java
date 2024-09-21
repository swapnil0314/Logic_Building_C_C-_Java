//Second Smallest and Second Largest element in an array


public class array3 {
    

    public static void main(String[] args) {

        int[] arr = {5 , 3 , 7 , 2 , 8 , 9};


        int firstSmallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for(int i = 0 ; i < arr.length ; i++)
        {
            if (arr[i] < firstSmallest) 
            {
                secondSmallest = firstSmallest;
                firstSmallest = arr[i];   
            }
            else if (arr[i] < secondSmallest && arr[i] != firstSmallest) 
            {
                secondSmallest = arr[i];   
            }
        }

        if (secondSmallest == Integer.MAX_VALUE) {
            System.out.println("There is no second smallest element.");
        } else {
            System.out.println("Second Smallest Element: " + secondSmallest);
        }
        
    }
}
