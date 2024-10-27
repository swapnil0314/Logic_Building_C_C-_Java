/*Reverse a String
Write a function to reverse a string (without using built-in reverse functions).

Count Vowels and Consonants in a String
Given a string, count the number of vowels and consonants.

Remove Duplicate Characters
Remove duplicate characters from a string while preserving the order.

Find the First Non-Repeating Character
Find the first character in a string that does not repeat. Return the character or -1 if none exists.

Check if Two Strings are Anagrams
Determine if two strings are anagrams of each other.

Check if a String Contains Only Digits
Verify if a given string consists only of numeric characters.

Count Occurrences of a Character in a String
Count how many times a given character appears in a string.

Longest Common Prefix
Given an array of strings, find the longest common prefix.

Implement strStr()
Implement strStr() (or indexOf) which finds the first occurrence of a substring in a string. */


public class ProblemStrEasy {

    public static void BReversee(String str)
    {
        int n = str.length();

        String rev = "";

        for(int i= n-1 ; i>=0 ; i--)
        {
            rev += str.charAt(i);
        }

        System.out.println(rev);

    }

    public static void OReverse(String str)
    {
        int n = str.length();

        char [] charArray = str.toCharArray();
        
        int left = 0 ; int right = n-1;

        while (left < right) 
        {
            char temp = charArray[left];

            charArray[left] = charArray[right];

            charArray[right] = temp;

            left++;
            right--;

        }

        System.out.println( new String(charArray));
    }

    public static void OOReverse(String str)
    {

        StringBuilder reversedString = new StringBuilder();

        for(int i=str.length()-1 ; i>=0 ; i--)
        {
            reversedString.append(str.charAt(i));
        }

        System.out.println(reversedString.toString());
    }



    public static void main(String[] args) {
        
        String str = "GeekForGeeks";

        //BReversee(str);
        //OReverse(str);
        OOReverse(str);
    }
    
}
