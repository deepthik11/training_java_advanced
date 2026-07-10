package day5;

public class PrintVowels {
    public static void main(String[] args) {
        String s = "DEEPTHIK RAI B";

        for (int i = 0; i < s.length(); i++) {
            char c = Character.toLowerCase(s.charAt(i));
            if (c=='a' || c=='e' || c=='i' || c=='o' || c=='u') {
                System.out.print(s.charAt(i) + " ");
            }
        }
    }
}