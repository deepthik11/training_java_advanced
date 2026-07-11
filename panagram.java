package day6;

public class panagram {
    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the lazy dog";
        str = str.toLowerCase();
        boolean isPanagram = true;

        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (str.indexOf(ch) == -1) {
                isPanagram = false;
                break;
            }
        }

        if (isPanagram) {
            System.out.println("The string is a panagram.");
        } else {
            System.out.println("The string is not a panagram.");
        }
    }
    
}
