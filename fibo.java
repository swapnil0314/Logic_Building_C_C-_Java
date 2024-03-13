import java.util.*;


class fibo
{
    public static void main(String[] args) 
    {
        int n = 0, n1= 1, n2 , n3,i, icnt = 10;

        //printing 0 and 1
        System.out.print(n+" "+n1);

        // for loop

        for(i=2; i<icnt ; ++i)
        {
            n2=n+n1;
            System.out.print(""+n2);
            n=n1;
            n1=n2;
        }
        
    }

}