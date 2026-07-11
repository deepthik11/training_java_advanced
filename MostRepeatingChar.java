import java.util.Scanner;
import java.util.LinkedHashMap;

public class MostRepeatingChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        LinkedHashMap<Character, Integer> freq = new LinkedHashMap<>();
        for (char c : str.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        int maxCount = 0;
        for (int count : freq.values()) {
            if (count > maxCount) maxCount = count;
        }

        System.out.print("Most repeating character(s): ");
        for (char c : freq.keySet()) {
            if (freq.get(c) == maxCount) {
                System.out.print(c + " ");
            }
        }
        System.out.println("(" + maxCount + " times each)");
        sc.close()

        System.out.println();