//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
class Rat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[][] a = new int[n][n];
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++) a[i][j] = sc.nextInt();

            Solution obj = new Solution();
            ArrayList<String> res = obj.findPath(a, n);
            Collections.sort(res);
            if (res.size() > 0) {
                for (int i = 0; i < res.size(); i++)
                    System.out.print(res.get(i) + " ");
                System.out.println();
            } else {
                System.out.println(-1);
            }
        }
    }
}

// } Driver Code Ends


// User function Template for Java

// m is the given matrix and n is the order of matrix

class Solution {
    public static ArrayList<String> findPath(int[][] m, int n) {
        ArrayList<String> paths = new ArrayList<>();
        boolean[][] visited = new boolean[n][n];
        
        // If the starting cell is blocked, return empty list
        if (m[0][0] == 0) {
            return paths;
        }
        
        // Call the recursive function to find paths
        findPathUtil(m, n, 0, 0, "", visited, paths);
        
        // Sort the paths lexicographically
        Collections.sort(paths);
        return paths;
    }
    
    private static void findPathUtil(int[][] m, int n, int row, int col, String path, 
                                     boolean[][] visited, ArrayList<String> paths) {
        // Base case: if we reached the bottom-right cell
        if (row == n-1 && col == n-1) {
            paths.add(path);
            return;
        }
        
        // Mark current cell as visited
        visited[row][col] = true;
        
        // Try moving down
        if (isValid(m, n, row+1, col, visited)) {
            findPathUtil(m, n, row+1, col, path+"D", visited, paths);
        }
        
        // Try moving left
        if (isValid(m, n, row, col-1, visited)) {
            findPathUtil(m, n, row, col-1, path+"L", visited, paths);
        }
        
        // Try moving right
        if (isValid(m, n, row, col+1, visited)) {
            findPathUtil(m, n, row, col+1, path+"R", visited, paths);
        }
        
        // Try moving up
        if (isValid(m, n, row-1, col, visited)) {
            findPathUtil(m, n, row-1, col, path+"U", visited, paths);
        }
        
        // Backtrack: mark current cell as unvisited
        visited[row][col] = false;
    }
    
    private static boolean isValid(int[][] m, int n, int row, int col, boolean[][] visited) {
        // Check if the move is within the maze and cell is not blocked and not visited
        return (row >= 0 && row < n && col >= 0 && col < n && m[row][col] == 1 && !visited[row][col]);
    }
}