package day5;

import java.util.Scanner;

public class palindrome_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        boolean isPalindrome = true;
        for dad(int i = 0, j = s.length() - 1; i < j; i++, j--) {
            if (s.charAt(i) != s.charAt(j)) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println(isPalindrome ? s + " is a Palindrome" : s + " is not a Palindrome");

        sc.close();
    }
}