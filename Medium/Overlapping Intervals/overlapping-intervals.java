//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            String[] s = br.readLine().trim().split(" ");
            int[][] Intervals = new int[n][2];
            int j = 0;
            for(int i = 0; i < n; i++){
                Intervals[i][0] = Integer.parseInt(s[j]);
                j++;
                Intervals[i][1] = Integer.parseInt(s[j]);
                j++;
            }
            Solution obj = new Solution();
            int[][] ans = obj.overlappedInterval(Intervals);
            for(int i = 0; i < ans.length; i++){
                for(j = 0; j < ans[i].length; j++){
                    System.out.print(ans[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


class Solution
{
    public int[][] overlappedInterval(int[][] Intervals)
    {
        // Code here // Code here
        
        Arrays.sort(Intervals, new Comparator<int[]>(){
            
            @Override
            
            public int compare(int[] interval1, int[] interval2){
                
                int startComparison = Integer.compare(interval1[0], interval2[0]);
                
                if(startComparison!=0){
                    return startComparison;
                }
                else{
                   return Integer.compare(interval1[1], interval2[1]);
                }
            }
        });
        
        
         ArrayList<int[]> res = new ArrayList<>();

        int start = Intervals[0][0];
        int end = Intervals[0][1];

       
       for (int i = 1; i < Intervals.length; i++) {
            // If the current interval overlaps with the previous one, merge them
            if (Intervals[i][0] <= end) {
                end = Math.max(end, Intervals[i][1]);
            } else {
                // Otherwise, add the previous interval to the result list
                res.add(new int[]{start, end});
                start = Intervals[i][0];
                end = Intervals[i][1];
            }
        }
      
        res.add(new int[]{start, end});

    
        int[][] result = new int[res.size()][2];
        for (int i = 0; i < res.size(); i++) {
            result[i] = res.get(i);
        }

        return result;
       
        
    }
}
