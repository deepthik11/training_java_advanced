package day5;
import java.util.Scanner;

public class removeoddindex {
 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String str = sc.nextLine();

        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0) {
                result = result + str.charAt(i);
            }
        }

        System.out.println("String after removing odd index characters: " + result);
    }
}
    
}
