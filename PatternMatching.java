public class PatternMatching {
    public static void main(String[] args) {
        String text = "ababcababcabc";
        String pattern = "abc";

        int n = text.length();
        int m = pattern.length();
        int count = 0;

        for (int i = 0; i <= n - m; i++) {
            boolean found = true;

            for (int j = 0; j < m; j++) {
                if (text.charAt(i + j) != pattern.charAt(j)) {
                    found = false;
                    break;
                }
            }

            if (found) {
                System.out.println("Match found at index: " + i);
                count++;
            }
        }

        System.out.println("Total matches: " + count);
    }
}