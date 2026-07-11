package day6;

public class Stringpalindrome {
    public static void main(String[] args)
    {
        System.out.println("Enter a string to check if it's a palindrome:");
        String s = new java.util.Scanner(System.in).nextLine();
        String reversed = new StringBuilder(s).reverse().toString();

        if (s.equals(reversed)) {
            System.out.println(s + " is a palindrome.");
        } else {
            System.out.println(s + " is not a palindrome.");
        }   
    }
    
}
