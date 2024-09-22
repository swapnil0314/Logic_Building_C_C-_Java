public class Swap3 {

    public static void main(String[] args) {
        
        int a = 10 , b = 20; 

        System.out.println("Befor swapping values are : "+a+" "+b);

        //logic 2 without using third variable

        // a = a*b;        //10*20=200
        // b = a/b;        //200/20=10
        // a = a/b;        //200/10=20

        //single statement

        b = a+b-(a=b);

        System.out.println("After swappnig values : "+a+ " "+b);
    }
    
}
