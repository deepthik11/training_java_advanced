package day5;

import java.util.Scanner;

public class HideCFewChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        StringBuilder masked = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (i < 6 && i < s.length()) {
                masked.append("*");
            } else {
                masked.append(s.charAt(i));
            }
        }

        System.out.println("Masked string: " + masked);

        sc.close();
    }
}