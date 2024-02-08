//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String s1 = br.readLine();
            String[] S = s1.split(" ");
            String s = S[0];
            String t = S[1];
            Solution ob = new Solution();
            int ans = ob.editDistance(s, t);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


class Solution {
    public int editDistance(String s, String t) {
        // Code here
        int m = s.length();
        int n = t.length();
        
        
        int[][] dp = new int[m+1][n+1];
        
        for(int[] arr: dp){
            
            Arrays.fill(arr,-1);
        }
        
        return eD(s,t,m,n,dp);
        
    }
    
    
    public int eD(String s1, String s2, int m, int n, int[][] dp){
        
            if(dp[m][n]!=-1){
                return dp[m][n];
            }
            if(m==0)
                return n;
            if(n==0)
                return m;
                
            if(s1.charAt(m-1)==s2.charAt(n-1))
                return dp[m][n] = eD(s1,s2,m-1,n-1,dp);
            else
            {
                return dp[m][n] = 1 + Math.min(eD(s1,s2,m,n-1,dp), Math.min(eD(s1,s2,m-1,n,dp), 
                                                            eD(s1,s2,m-1,n-1,dp)));
            }
        
        
    }
}