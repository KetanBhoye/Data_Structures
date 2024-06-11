//{ Driver Code Starts
import java.io.*;
import java.util.*;

class IntArray {
    public static int[] input(BufferedReader br, int n) throws IOException {
        String[] s = br.readLine().trim().split(" ");
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = Integer.parseInt(s[i]);

        return a;
    }

    public static void print(int[] a) {
        for (int e : a) System.out.print(e + " ");
        System.out.println();
    }

    public static void print(ArrayList<Integer> a) {
        for (int e : a) System.out.print(e + " ");
        System.out.println();
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            int n;
            n = Integer.parseInt(br.readLine());

            int x;
            x = Integer.parseInt(br.readLine());

            int y;
            y = Integer.parseInt(br.readLine());

            int[] arr = IntArray.input(br, n);

            int[] brr = IntArray.input(br, n);

            Solution obj = new Solution();
            long res = obj.maxTip(n, x, y, arr, brr);

            System.out.println(res);
        }
    }
}

// } Driver Code Ends




class Pair {
    long a;
    long b;
    long diff;

    Pair(long diff, long a, long b) {
        this.diff = diff;
        this.a = a;
        this.b = b;
    }
}

class Solution {
    public static long maxTip(int n, int x, int y, int[] arr, int[] brr) {
        ArrayList<Pair> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            long di = Math.abs(arr[i] - brr[i]);
            list.add(new Pair(di, arr[i], brr[i]));
        }

        Collections.sort(list, new Comparator<Pair>() {
            @Override
            public int compare(Pair p1, Pair p2) {
                return Long.compare(p2.diff, p1.diff);
            }
        });

        long sum = 0;
        for (int i = 0; i < n; i++) {
            if (x == 0) {
                sum += list.get(i).b;
                y--;
            } else if (y == 0) {
                sum += list.get(i).a;
                x--;
            } else {
                if (list.get(i).a > list.get(i).b) {
                    sum += list.get(i).a;
                    x--;
                } else {
                    sum += list.get(i).b;
                    y--;
                }
            }
        }

        return sum;
    }
}
