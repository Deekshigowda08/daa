// Hoorspool algorithm in Java for pattern searching
public class Hoorspool {
    public static int horspoolSearch(String text, String pattern) {
        int m = pattern.length();
        int n = text.length();
        if (m > n) return -1;

        int[] shift = new int[256];
        for (int i = 0; i < 256; i++) {
            shift[i] = m;
        }
        for (int i = 0; i < m - 1; i++) {
            shift[pattern.charAt(i)] = m - 1 - i;
        }

        int i = m - 1;
        while (i < n) {
            int k = 0;
            while (k < m && pattern.charAt(m - 1 - k) == text.charAt(i - k)) {
                k++;
            }
            if (k == m) {
                return i - m + 1; // Match found
            } else {
                i += shift[text.charAt(i)];
            }
        }
        return -1; // No match found
    }

    public static void main(String[] args) {
        String text = "abacaabadcabacabaabb";
        String pattern = "abacab";
        int pos = horspoolSearch(text, pattern);
        if (pos != -1) {
            System.out.println("Pattern found at position: " + pos);
        } else {
            System.out.println("Pattern not found");
        }
    }
}

