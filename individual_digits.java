package day8;

import java.util.Scanner;

public class individual_digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
    
        
        num = Math.abs(num);
        
        while (num > 0) {
            System.out.println(num % 10);  // Extract last digit
            num /= 10;                     // Remove last digit
        }
        
        sc.close();
    }
}