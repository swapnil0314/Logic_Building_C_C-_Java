


public class Swap2 {

    public static void main(String[] args) {
        
        int a = 10 , b = 20; 

        System.out.println("Befor swapping values are : "+a+" "+b);

        //logic 2 without using third variable

        a = a+b;        //10+20=30
        b = a-b;        //30-20=10
        a = a-b;        //30-10=20

        System.out.println("After swappnig values : "+a+ " "+b);
    }
    
}
