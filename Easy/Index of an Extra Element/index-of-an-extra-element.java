//{ Driver Code Starts
import java.util.*;

class ExtraElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[n - 1];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            for (int i = 0; i < n - 1; i++) b[i] = sc.nextInt();
            Solution g = new Solution();
            System.out.println(g.findExtra(n, a, b));
        }
    }
}
// } Driver Code Ends


/*Complete the function below*/
class Solution {
    public int findExtra(int n, int arr1[], int arr2[]) {
        
        //edge case 1
        if(n==1) return 0;
        
        // edge case 2
        if(arr1[0] != arr2[0]) return 0;
        
        //binary search
        int l=0;
        int h=n-1;
        while(l<h){
            int m=(l+h)/2;
            if(arr1[m]!=arr2[m]){
                if(arr1[m-1]==arr2[m-1]){
                    return m;
                }else{
                    h = m-1;
                }
            }else{
                l=m+1;
            }
        }
        return l;
    }
}