//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Sorting
{
    public static void main (String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        
        while(t-- > 0)
        {
            long n = sc.nextLong();
            long arr[] = new long[(int)n];
            
            for(long i = 0; i < n; i++)
             arr[(int)i] = sc.nextLong();
             
            System.out.println(new Solution().inversionCount(arr, n));
            
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    // arr[]: Input Array
    // N : Size of the Array arr[]
    //Function to count inversions in the array.
     static long inversionCount(long arr[], long N) {
        return countInversions(arr, 0, N - 1);
    }
    
    static long countInversions(long[] arr, long low, long high) {
        if (low >= high) {
            return 0;
        }
        
        long mid = (low + high) / 2;
        
        long invCount = 0;
        invCount += countInversions(arr, low, mid);
        invCount += countInversions(arr, mid + 1, high);
        invCount += merge(arr, low, mid, high);
        
        return invCount;
    }
    
    static long merge(long[] arr, long low, long mid, long high) {
        ArrayList<Long> temp = new ArrayList<>();
        
        long left = low;
        long right = mid + 1;
        long invCount = 0;
        
        while (left <= mid && right <= high) {
            if (arr[(int)left] <= arr[(int)right]) {
                temp.add(arr[(int)left]);
                left++;
            } else {
                temp.add(arr[(int)right]);
                right++;
                invCount += (mid + 1 - left); // Count inversions
            }
        }
        
        while (left <= mid) {
            temp.add(arr[(int)left]);
            left++;
        }
        
        while (right <= high) {
            temp.add(arr[(int)right]);
            right++;
        }
        
        for (long i = low; i <= high; i++) {
            arr[(int)i] = temp.get((int)(i - low));
        }
        
        return invCount;
    }
}