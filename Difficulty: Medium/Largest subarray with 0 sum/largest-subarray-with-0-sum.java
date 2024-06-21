//{ Driver Code Starts
import java.util.*;

class MaxLenZeroSumSub
{

    // Returns length of the maximum length subarray with 0 sum

    // Drive method
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0)
        {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();

            GfG g = new GfG();
            System.out.println(g.maxLen(arr, n));
            T--;
        }
    }
}
// } Driver Code Ends


class GfG
{
    int maxLen(int arr[], int n) // Added k as a parameter
{   
    int k = 0;
    int len = 0;
    
    HashMap<Long, Integer> preSumMap = new HashMap<>();
    
    long sum = 0;
    
    // Added this line to handle the case where the subarray starts from index 0
    preSumMap.put(0L, -1); // FIXED: Initialize with 0 sum at index -1
    
    for(int i = 0; i < n; i++) {
        sum += arr[i];
        
        // FIXED: Check if (sum - k) exists in the map
        if(preSumMap.containsKey(sum - k)) {
            // FIXED: Calculate length correctly
            len = Math.max(len, i - preSumMap.get(sum - k));
        }
        
        // Only add to map if not already present
        // This ensures we keep the leftmost index for each sum
        if(!preSumMap.containsKey(sum)) {
            preSumMap.put(sum, i);
        }
    }
    
    return len;
}
}