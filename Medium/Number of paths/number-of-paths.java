//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GfG { 
    
	public static void main (String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
		    String inputLine[] = br.readLine().trim().split(" ");
		    int M = Integer.parseInt(inputLine[0]);
		    int N = Integer.parseInt(inputLine[1]);
		    Solution ob = new Solution();
		    System.out.println(ob.numberOfPaths(M, N));
		}
	}
}




// } Driver Code Ends

class Solution{
   private static final int MOD = 1000000007;
    private static long modInverse(long base) {
        return power(base, MOD - 2);
    }
    private static long power(long base, int exponent) {
        long result = 1;
        while (exponent > 0) {
            if (exponent % 2 == 1) {
                result = (result * base) % MOD;
            }
            base = (base * base) % MOD;
            exponent /= 2;
        }
        return result;
    }
    private static int nCk(int n, int k) {
        long numerator = 1;
        long denominator = 1;

        for (int i = 0; i < k; i++) {
            numerator = (numerator * (n - i)) % MOD;
            denominator = (denominator * (i + 1)) % MOD;
        }
        return (int) ((numerator * modInverse(denominator)) % MOD);
    }

    public static int numberOfPaths(int M, int N) {
        return nCk(M + N - 2, M - 1);
    }

    public static void main(String[] args) {
        int M = 10;
        int N = 100000000;
        int result = numberOfPaths(M, N);
        System.out.println(result);
}
}