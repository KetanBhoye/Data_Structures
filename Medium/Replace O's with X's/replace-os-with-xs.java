//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String a[] = in.readLine().trim().split(" ");
            int n = Integer.parseInt(a[0]);
            int m = Integer.parseInt(a[1]);
            char mat[][] = new char[n][m];
            for(int i=0; i<n; i++)
            {
                String S[] = in.readLine().trim().split(" ");
                for(int j=0; j<m; j++)
                {
                    mat[i][j] = S[j].charAt(0);
                }
            }
            
            Solution ob = new Solution();
            char[][] ans = ob.fill(n, m, mat);
            for(int i = 0;i < n;i++) {
                for(int j = 0;j < m;j++) {
                    System.out.print(ans[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    
    public static void dfs(int i, int j, int n, int m, int[][] vis, char a[][]) {
        if(i>=0 && j>=0 && i<n && j<m && a[i][j]=='O' && vis[i][j]==0) {
            vis[i][j]=1;
            dfs(i-1,j,n,m,vis,a);
            dfs(i,j+1,n,m,vis,a);
            dfs(i+1,j,n,m,vis,a);
            dfs(i,j-1,n,m,vis,a);
            return;
        }
        return;
    }
    
    static char[][] fill(int n, int m, char a[][])
    {
        // code here
        int[][] vis=new int[n][m];
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) vis[i][j]=0;
        }
        for(int j=0;j<m;j++) {
            if(a[0][j]=='O' && vis[0][j]==0) dfs(0,j,n,m,vis,a);
        }
        for(int j=0;j<m;j++) {
            if(a[n-1][j]=='O' && vis[n-1][j]==0) dfs(n-1,j,n,m,vis,a);
        }
        for(int i=0;i<n;i++) {
            if(a[i][0]=='O' && vis[i][0]==0) dfs(i,0,n,m,vis,a);
        }
        for(int i=0;i<n;i++) {
            if(a[i][m-1]=='O' && vis[i][m-1]==0) dfs(i,m-1,n,m,vis,a);
        }
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                if(a[i][j]=='O' && vis[i][j]==0) a[i][j]='X';
            }
        }
        return a;
    }
    
}