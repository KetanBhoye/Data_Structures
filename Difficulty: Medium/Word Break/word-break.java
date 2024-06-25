//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
public class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int n;
                    n = sc.nextInt();
                    ArrayList<String> dictionary = new ArrayList<String>();
                    for(int i = 0;i<n;i++)
                        {
                            String p = sc.next();
                            dictionary.add(p);
                        }
                    String s = sc.next();
                    Solution obj = new Solution();  
                    System.out.println(obj.wordBreak(n, s, dictionary));  
                    
                }
        }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    public static int wordBreak(int n, String s, ArrayList<String> dict) {
        return wordBreakHelper(s, dict) ? 1 : 0;
    }
    
    private static boolean wordBreakHelper(String s, ArrayList<String> dict) {
        if (s.length() == 0) {
            return true;
        }
        
        for (int i = 1; i <= s.length(); i++) {
            String left = s.substring(0, i);
            if (dict.contains(left)) {
                String right = s.substring(i);
                if (wordBreakHelper(right, dict)) {
                    return true;
                }
            }
        }
        
        return false;
    }
}

