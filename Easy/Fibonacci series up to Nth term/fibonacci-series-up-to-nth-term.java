//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Main {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            Solution obj = new Solution();
            int ans[] = obj.Series(n);
            for (int i : ans) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


class Solution {

   int[] Series(int n) {
        // code here
         int mod = 1000000007 ;
        int ans[] = new int[n+1] ;
        
        ans[0] = 0 ;
        ans[1] = 1 ;
        
        if( n == 1 ) return ans ;
        
        ans[2] = 1 ;
        
        if( n == 2 ) return ans ;
        
        for( int i = 3 ; i  <= n ; i++ )
        {
            ans[i] = ( ans[i-1] + ans[i-2] )%mod ;
        }
        
        return ans ;
    }
}