//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            int b[] = new int[n];
            for (int i = 0; i < n; i++) {
                b[i] = sc.nextInt();
            }

            Solution obj = new Solution();
            List<Integer> ans = obj.maxCombinations(n, k, a, b);
            for (int e : ans) System.out.print(e + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    static List<Integer> maxCombinations(int n, int k, int a[], int b[]) {

           List<Integer> ans = new ArrayList<>();
        Arrays.sort(a);
        Arrays.sort(b);
        
        Queue<int[]> pq = new PriorityQueue<>((o1,o2)->(o2[0]-o1[0]));
        pq.add(new int[]{b[n-1]+a[n-1],n-1,n-1});
        
        while(!pq.isEmpty() && k>0)
        {
            int x[] = pq.poll();
            ans.add(x[0]);
            if(x[1]==n-1 && x[2]-1>=0)
            {
                pq.add(new int[]{b[x[2]-1]+a[n-1],n-1,x[2]-1});
            }
            
            if(x[1]-1>=0)
            {
                pq.add(new int[]{b[x[2]]+a[x[1]-1],x[1]-1,x[2]});
            }
            k--;
            
        }
        
        return ans;
        
    }
}
