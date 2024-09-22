//How to reverse a String in java? Can you write a program without using any java inbuilt methods?

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.Stack;

/**
 * string1
 */
public class string1 {


    //using inbuild method charAt
    public static void main1(String[] args) {
        

        String str = "Geeks" , nstr = "";
        char ch;

        System.out.println("Original Word: ");
        System.out.println("Geeks");

        for(int i = 0 ; i < str.length(); i++)
        {
            ch = str.charAt(i);         //extracts each character

            nstr = ch+nstr;             //add each character in front of the string 
        }

        System.err.println("Reversed String is : "+nstr);
    }

    //reverse string using byte array method 
    public static void main2(String[] args) {

        String input = "GeeksForGeeks";

        byte [] strBytesArray = input.getBytes();

        byte [] result = new byte[strBytesArray.length];

        for(int i = 0 ; i < strBytesArray.length ; i++)
        {
            result[i] = strBytesArray[strBytesArray.length - i - 1];

        }

        System.out.println(new String(result));
        
    }

    public static void main3(String[] args) {
        
        String input = "Geeks For Geeks";

        char [] hello = input.toCharArray();

        List<Character> trail1 = new ArrayList<>();

        for(char c : hello)
        
            trail1.add(c);
        
        Collections.reverse(trail1);

       
        ListIterator li = trail1.listIterator();
            while (li.hasNext()) 
            {
                System.out.print(li.next());   
            }
    }

    public static void main4(String[] args) {
        String str = "Geeks";

        StringBuffer sbr = new StringBuffer(str);

        sbr.reverse();

        System.out.println(sbr);
    }

    public static void main(String[] args) {
        
        String s = "Geeks For Geeks";

        Stack<Character> stack = new Stack<>();

        for(char c: s.toCharArray())
        {
            stack.push(c);
        }

        String temp = "";

        while (!stack.isEmpty()) 
        {
            temp += stack.pop();
        }

        System.out.println("Reversed String is : "+temp);
    }
}