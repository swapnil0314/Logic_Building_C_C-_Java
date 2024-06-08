import java.util.Scanner;

public class array1 {

    public static boolean search(int matrix[][], int key)
    {
        for(int i = 0 ; i<matrix.length ; i++)
        {
            for(int j = 0 ; j<matrix[0].length ; j++)
            {
                if (matrix[i][j] == key) 
                {
                    System.out.println("found ar cell ("+ i +","+j+")");
                    return true;   
                }
              
            }
           
        }
        System.out.println("key not found ");
        return false;

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

        search(matrix, 5);

    }
}