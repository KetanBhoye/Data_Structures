//{ Driver Code Starts

// Initial Template for Java
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int N = sc.nextInt();
            ArrayList<Integer> arr = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                arr.add(sc.nextInt());
            }
            Solution ob = new Solution();

            ArrayList<Integer> ans = ob.subsetSums(arr, N);
            Collections.sort(ans);
            for (int sum : ans) {
                System.out.print(sum + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


// User function Template for Java//User function Template for Java
class Solution {
    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int n) {
        // code here
        
        ArrayList<Integer> res = new ArrayList<>();
        
        subsetHelper(0,0,arr,n,res);
        
        Collections.sort(res);
        return res;
        
    }
    
    void subsetHelper(int ind, int sum, ArrayList<Integer> arr, int n, ArrayList<Integer> res){
        
        
        if(ind == n){
            
            res.add(sum);
            return;
        }
        
        subsetHelper( ind+1,sum+arr.get(ind) , arr,  n, res);
        subsetHelper( ind+1,sum, arr,  n, res);
        
    }
}