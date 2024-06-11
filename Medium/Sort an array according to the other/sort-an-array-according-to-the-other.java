//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

import java.util.HashMap; 
import java.util.Map; 
import java.util.Map.Entry; 


// } Driver Code Ends
//User function Template for Java

class Solution{
    // A1[] : the input array-1
    // N : size of the array A1[]
    // A2[] : the input array-2
    // M : size of the array A2[]
    
    //Function to sort an array according to the other array.
   public static int[] sortA1ByA2(int[] A1, int N, int[] A2, int M) {
        ArrayList<Integer> res = new ArrayList<>();
        TreeMap<Integer, Integer> map = new TreeMap<>();

        // Count occurrences of each element in A1
        for (int i = 0; i < N; i++) {
            map.put(A1[i], map.getOrDefault(A1[i], 0) + 1);
        }

        // Add elements from A2 in the order they appear in A2
        for (int i = 0; i < M; i++) {
            if (map.containsKey(A2[i])) {
                for (int j = 0; j < map.get(A2[i]); j++) {
                    res.add(A2[i]);
                }
                map.remove(A2[i]);
            }
        }

        // Add remaining elements that are not in A2, sorted in ascending order
        if (map.size() > 0) {
            for (Map.Entry<Integer, Integer> e : map.entrySet()) {
                for (int j = 0; j < e.getValue(); j++) {
                    res.add(e.getKey());
                }
            }
        }

        // Convert the result list to an array
        int[] sortedArray = new int[res.size()];
        for (int i = 0; i < sortedArray.length; i++) {
            sortedArray[i] = res.get(i);
        }

        return sortedArray;
    }
}



//{ Driver Code Starts.
class Main {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();
		
		while(t-->0)
		{
		    int n=sc.nextInt();
		    int m=sc.nextInt();
		    int a1[]=new int[n];
		    int a2[]=new int[m];
		    
		    for(int i=0;i<n;i++)
		    a1[i]=sc.nextInt();
		    
		    for(int i=0;i<m;i++)
		    a2[i]=sc.nextInt();
		    Solution ob=new Solution();
		    a1 = ob.sortA1ByA2(a1,n,a2,m);
		    for(int x:a1)
		    System.out.print(x+" ");
		    
		    System.out.println();
		}
	}
	

}



// } Driver Code Ends