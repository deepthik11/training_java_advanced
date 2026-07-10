package day5;

public class armstrong {
    public static void main(String[] args) {
        System.out.println("Armstrong numbers between 1 and 3000:");

        for (int num = 1; num <= 3000; num++) {
            int a = num / 1000;
            int b = (num / 100) % 10;
            int c = (num / 10) % 10;
            int d = num % 10;

            int sum = (a*a*a) + (b*b*b) + (c*c*c) + (d*d*d);

            if (sum == num) {
                System.out.println(num);
            }
        }
    }
}