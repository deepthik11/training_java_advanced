package day5;

public class count_words_String {
    public static void main(String[] args) {
        String str = "Hello World  how are you doing";
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                count++;
            }
        }

        System.out.println("Number of words: " + (count + 1));
    }
    
}
