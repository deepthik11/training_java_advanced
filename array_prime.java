package day7;
import java.util.Scanner;

public class array_prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of the array");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i++) {
            int num = arr[i];
            boolean prime = true;

            if(num <= 1) {
                prime = false;
            } else {
                for(int j = 2; j < num; j++) {
                    if(num % j == 0) {
                        prime = false;
                        break;
                    }
                }
            }

            if(prime) {
                System.out.println(num + " is prime");
            } else {
                System.out.println(num + " is not prime");
            }
        }

        sc.close();
    }
}