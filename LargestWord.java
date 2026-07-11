package day6;
public class LargestWord {
    public static void main(String[] args) {
        String str = "I love programming in Java language";

        String[] words = str.split(" ");

        String largestWord = "";

        for (String word : words) {
            if (word.length() > largestWord.length()) {
                largestWord = word;
            }
        }

        System.out.println("Original string: " + str);
        System.out.println("Largest word: " + largestWord);
        System.out.println("Length: " + largestWord.length());
    }
}