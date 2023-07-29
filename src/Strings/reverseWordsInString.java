package Strings;

import java.util.Arrays;
public class reverseWordsInString {

    public static void main(String[] args) {
        String s = "Welcome to Gfg";
        int n = s.length();
        char[] str = s.toCharArray();
        System.out.println("Original string: " + s);
        System.out.println("After reversing words in the string:");
        reverseWords(str, n);
        System.out.println(new String(str)); // Convert char array to String and then print
    }

    public static void reverseWords(char[] str, int n) {
        int start = 0;
        for (int end = 0; end < n; end++) {
            if (str[end] == ' ') {
                reverse(str, start, end - 1);
                start = end + 1;
            }
        }
        reverse(str, start, n - 1);
        reverse(str, 0, n - 1);
    }

    public static void reverse(char[] arr, int low, int high) {
        while (low <= high) {
            char temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }
}


