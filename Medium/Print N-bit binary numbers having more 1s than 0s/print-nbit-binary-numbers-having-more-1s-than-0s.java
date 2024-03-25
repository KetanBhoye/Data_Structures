//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            ArrayList<String> result = ob.NBitBinary(n);
            for(String value  : result){
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution {
    public void generate(ArrayList<String> ans,StringBuilder sb,int l,int n1,int n0){
        if(l==0){
            if(n1>=n0) ans.add(sb.toString());
            return;
        }
        else{
            if(n1>=n0){
            sb.append("1");
            generate(ans,sb,l-1,n1+1,n0);
            sb.delete(sb.length()-1,sb.length());
            }
            sb.append("0");
            generate(ans,sb,l-1,n1,n0+1);
            sb.delete(sb.length()-1,sb.length());
        }
    }
    ArrayList<String> NBitBinary(int N) {
        ArrayList<String> ans=new ArrayList<>();
        generate(ans,new StringBuilder(""),N,0,0);
        return ans;
    }
}