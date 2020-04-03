/*
Write a program that receives a word as an input from the user and checks if it is a palindrome:
if it reads the same backward as forward. A few examples are “civic”, “radar” and “level”. To make
your program more advanced, ignore punctuation, capitalization, and spaces, and recognize
sentences as “A man, a plan, a canal - Panama”, “Murder for a jar of red rum” and “Madam, I’
am Adam”.
Written By MOHAMMAD EL KASWANI*/
import java.util.*;   
 public class Palindrome  
{  
    public static void main(String args[])  
    {  
        String original, reverse = ""; // Objects of String class  
        Scanner in = new Scanner(System.in);   
        System.out.println("Enter a string/number to check if it is a palindrome");  
        original = in.nextLine();   
        int length = original.length();   
        for ( int i = length - 1; i >= 0; i-- )  
            reverse = reverse + original.charAt(i);  
        if (original.equals(reverse))  
            System.out.println("Entered string/number is a palindrome.");  
        else  
            System.out.println("Entered string/number isn't a palindrome.");   
    }  
}  