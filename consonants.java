package day5;

import java.util.Scanner;

public class consonants
 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        System.out.print("consonants in the string: ");
        for (int i = 0; i < s.length(); i++) {
            char c = Character.toLowerCase(s.charAt(i));
            if (c!='a' && c!='e' && c!='i' && c!='o' && c!='u') {
                System.out.print(s.charAt(i) + " ");
            }
        }
        sc.close();
    }
}