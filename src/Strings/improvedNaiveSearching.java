package Strings;

public class improvedNaiveSearching {
    public static void main(String[] args) {
        patternSearch("ABCEABEFABCD", "ABCD");
    }

    public static void patternSearch(String S, String patt) {
        int m = S.length();
        int n = patt.length();
        for (int i = 0; i <= m - n;) {
            int j;
            for (j = 0; j < n; j++) {
                if (patt.charAt(j) != S.charAt(i + j)){
                    break;
                }

            }
            if (j == n) {
                System.out.println("Pattern found at index: " + i);
            }
            if (j == 0) {
                i++;
            } else {
                i = i + j;
            }
        }
    }
}

