import java.util.Scanner;

public class array2 {

    public static void search(int matrix[][])
    {
        int largest = 0;
        for(int i = 0 ; i<matrix.length ; i++)
        {
            for(int j = 0 ; j<matrix[0].length ; j++)
            {
                if (matrix[i][j] > largest) 
                {
                   largest =  matrix[i][j] ;
                }
              
            }
           
        }
        System.out.println("The largest element is : "+largest);
        

    }

    public static void main(String[] args) {
        int matrix [][] = new int[3][3];
        
        Scanner sobj = new  Scanner(System.in);
        
        for(int i = 0 ; i<matrix.length ; i++)
        {
            for(int j = 0 ; j<matrix[0].length ; j++)
            {
                matrix[i][j]= sobj.nextInt();
            }
        }

        

        for(int i = 0 ; i<matrix.length ; i++)
        {
            for(int j = 0 ; j<matrix[0].length  ; j++)
            {
                System.out.print(matrix[i][j]+ " ");
                
            }
            System.out.println();
        }

        search(matrix);

    }
}