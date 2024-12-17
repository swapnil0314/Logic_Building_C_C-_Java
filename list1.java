
// Core Java Questions
// Write a program to print the Fibonacci series up to a given number.
// How do you check if a string is a palindrome? Write the code.
// Write a program to find the factorial of a number using recursion.
// Write a Java program to reverse a string without using inbuilt functions.


public class list1 {

    public static void fact(int n)
    {
        int f = 1;
        for(int i=n ; i>0 ; i--)
        {
            f = f*i;
        }

        System.out.println("The factorial of the number is :  "+f);
    }

    public static void fibo(int n)
    {
        int first = 0;
        int second = 1;  

        System.out.print(first+ " ");

        for(int i=0 ; i<n ; i++)
        {
            System.out.print(second+" ");

            int temp = second;
            second = first+ second; 
            first = temp;

        }
    }

    public static void palindrome(String s)
    {
       
        int n = s.length();

        for(int i=0 ; i<n/2 ; i++)
        {
            if (s.charAt(i) == s.charAt(n-i-1)) 
            {
                continue;
            }
            else
            {
                System.out.println("The string is not a palindrome");
                break;
            }
        }
    }

    public static int rFact(int i)
    {
        if (i == 1) 
        {
            return 1;   
        }

        return i*rFact(i-1);

    }

    public static void rev(String s)
    {
    
        char[] ss = s.toCharArray();

        int n =  ss.length;

        for(int i=0 ; i<n/2 ; i++)
        {
            char temp = ss[i];
            ss[i]=ss[n-1-i];
            ss[n-i-1] = temp;

        }
      
        String reversedString = new String(ss);

        System.out.println("The reversed string is : "+reversedString);

    }

    public static void main(String[] args) {
        
        int i = 7;
        String s = "soointegeropoos";

        //fact(i);
        //fibo(i);
       // palindrome(s);

       //rFact(i);
        //System.out.println("The factorial of the number is : "+rFact(i));

        rev(s);
    }
}