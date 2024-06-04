//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

class GfG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            Solution ob = new Solution();
            System.out.println(ob.binaryNextNumber(s));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    String binaryNextNumber(String s) {
        // Remove leading zeros for correct processing
        s = s.replaceFirst("^0+(?!$)", "");
        
        int n = s.length();
        StringBuilder result = new StringBuilder(s);
        
        // Traverse from the end to the beginning
        for (int i = n - 1; i >= 0; i--) {
            if (s.charAt(i) == '0') {
                result.setCharAt(i, '1');
                return result.toString();
            } else {
                result.setCharAt(i, '0');
            }
        }
        
        // If we finished the loop, all were '1's, we need an extra '1' at the beginning
        return "1" + result.toString();
    }
}