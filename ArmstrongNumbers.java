package day5;
public class ArmstrongNumbers {
    public static void main(String[] args) {
        System.out.println("Armstrong numbers between 1 and 3000:");

        for (int num = 1; num <= 3000; num++) {
            int original = num;
            int digits = String.valueOf(num).length();
            int sum = 0;
            int temp = num;

            while (temp > 0) {
                int digit = temp % 10;
                sum = sum + (int) Math.pow(digit, digits);
                temp = temp / 10;
            }

            if (sum == original) {
                System.out.println(num);
            }
        }
    }
}