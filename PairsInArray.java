import java.util.ArrayList;

public class PairsInArray {

    public static void PairsOfArray(int arr[])
    {
        int n = arr.length;
        int imaxSum = Integer.MIN_VALUE;
        ArrayList<Integer> aMax = new ArrayList<>();

        for(int i=0 ; i<n ; i++)
        {
            for(int j=i+1 ; j<n ; j++)
            {
                System.out.print(" [" +arr[i]+" , "+arr[j]+" ]");
                int isum = arr[i]+arr[j];
                if (imaxSum < isum) 
                {
                    imaxSum = isum;
                    aMax.clear();
                    aMax.add(arr[i]);
                    aMax.add(arr[j]);
                  
                }
                
            }
            System.out.println();
        }

        System.out.println("The Maximum sum of the pair is : "+imaxSum+"  of the pair  "+aMax);

    }


    public static void main(String[] args) {
        
        int arr[] = {21, 11, 29, 97, 66, 10, 6};

        PairsOfArray(arr);
    }
    
}
