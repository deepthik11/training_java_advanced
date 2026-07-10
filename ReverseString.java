package day5;

public class ReverseString {
    public static void main(String[] args) {
        String s = "Hello";
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            res = c + res;
        }
        System.out.println(res);
    }
}