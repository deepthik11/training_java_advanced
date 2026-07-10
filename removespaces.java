package day5;

import java.util.Scanner;

public class removespaces
 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String str = sc.nextLine();

        int start = 0;
        int end = str.length() - 1;

        // find index of first non-space character
        while (start <= end && str.charAt(start) == ' ') {
            start++;
        }

        // find index of last non-space character
        while (end >= start && str.charAt(end) == ' ') {
            end--;
        }

        String result = "";
        for (int i = start; i <= end; i++) {
            result = result + str.charAt(i);
        }

        System.out.println("String after trimming: " + result);
    }
}