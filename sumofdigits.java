package day8;

public class sumofdigits {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        int sum = 0;
        int number = Math.abs(num); // Handle negative numbers

        while (number > 0) {
            sum += number % 10; // Add last digit to sum
            number /= 10;       // Remove last digit
        }
        
        System.out.println("Sum of digits: " + sum);
    }
    
}
