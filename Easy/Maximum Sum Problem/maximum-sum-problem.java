//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int n = sc.nextInt();
                    Solution ob = new Solution();
                    System.out.println(ob.maxSum(n));
                }
        }
}    
// } Driver Code Ends


//User function Template for Java

class Solution
{
   public int maxSum(int n)
        {
            
            if(n<4){
                return n;
            }
           int ans=maxSum(n/2) + maxSum(n/3) + maxSum(n/4);
           
           if(ans>n){
               return ans;
           }
           else{
               return n;
           }
        }
}
