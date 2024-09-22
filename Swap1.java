public class Swap1 {

    public static void main(String[] args) {
        
        int a = 10 , b = 20; 

        System.out.println("Befor swapping values are : "+a+" "+b);

        //logic 1 third variable 

        int temp = a ; 

        a = b ;

        b = temp;

        System.out.println("After swappnig values : "+a+ " "+b);
    }
    
}
