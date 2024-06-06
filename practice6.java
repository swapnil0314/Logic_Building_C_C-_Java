//palindrome triangle

public class practice6 
{

    public static void palindromeTriangle(int n)
    {
            for(int i = 1 ; i<=n ; i++)
            {
                for(int j = 1 ; j<=n-i; j++)
                {
                    System.out.print(" ");
                }

                for(int j = i ; j>0; j--)
                {
                    System.out.print(j);
                }

                for(int j = 1 ; j<i; j++)
                {
                    System.out.print(j+1);
                }
                System.out.println();
            }
    }

    public static void main(String[] args) 
    {
        int r = 5;
        palindromeTriangle(r);
        
    }
    
}
