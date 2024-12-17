
// Write a program to check if a number is prime.
// How do you remove duplicate characters from a string in Java?
// Write a program to count the number of vowels and consonants in a string.
// Write a program to sort an array of integers in ascending order.
// How do you find the largest and smallest numbers in an array?
// Write a program to swap two numbers without using a third variable.

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class list2 {

    public static void checkPrime(int n)
    {

        for(int i=2 ; i<n/2 ; i++)
        {
            if (n%i != 0) 
            {
                System.out.println("The number is prime number ");
                break;
            }
            else
            {
                System.out.println("The number is not a prime number ");
            }
        }
    }

    public static void removeDuplicate(String s)
    {
       
        Set<Character> set = new LinkedHashSet<>();

        for(char c : s.toCharArray())
        {
            set.add(c);
        }
       
        StringBuilder result = new StringBuilder();

        for(char c : set)
        {
            result.append(c);
        }
       

        System.out.println("String without duplicates :" + result.toString());
    }


    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);

        String s = "soomveer";

        // System.out.println("Enter the number you want to check whether it is a prime or not: ");
        // int n =  sobj.nextInt(); 
        // checkPrime(n);

        removeDuplicate(s);


    }
    
}
