//{ Driver Code Starts
//Initial template for JAVA

import java.util.*;
import java.io.*;
import java.lang.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while (t-- > 0) {
            ArrayList<ArrayList<Integer>> list = new ArrayList<>();
            String st[] = read.readLine().trim().split("\\s+");
            int n = Integer.parseInt(st[0]);
            int m = Integer.parseInt(st[1]);

            for (int i = 0; i < n; i++)
                list.add(i, new ArrayList<Integer>());

            ArrayList<ArrayList<Integer>> prerequisites = new ArrayList<>();
            for (int i = 1; i <= m; i++) {
                String s[] = read.readLine().trim().split("\\s+");
                int u = Integer.parseInt(s[0]);
                int v = Integer.parseInt(s[1]);
                list.get(v).add(u);
                ArrayList<Integer> pair = new ArrayList<>();
                pair.add(u);
                pair.add(v);
                prerequisites.add(pair);
            }

            int[] res = new Solution().findOrder(n, m, prerequisites);
            
            if(res.length==0)
                System.out.println("No Ordering Possible");
            else
            {
                if (check(list, n, res) == true)
                    System.out.println("1");
                else
                    System.out.println("0");
            }
        }
    }
    static boolean check(ArrayList<ArrayList<Integer>> list, int V, int[] res) {
        int[] map = new int[V];
        for (int i = 0; i < V; i++) {
            map[res[i]] = i;
        }
        for (int i = 0; i < V; i++) {
            for (int v : list.get(i)) {
                if (map[i] > map[v]) return false;
            }
        }
        return true;
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    static class Edge{
        public int src;
        public int des;
        public int wt;

        public Edge(int src,int des,int wt){
            this.src=src;
            this.des=des;
            this.wt=wt;

        }

    }
    static boolean findOrderUtil(int cur, ArrayList<Edge>[] graph,boolean[] visited,Stack<Integer> stack,boolean[] stackArr){
       visited[cur]=true;
       stackArr[cur]=true;
        for (int i = 0; i <graph[cur].size() ; i++) {
            int edge=graph[cur].get(i).des;
            if(stackArr[edge]) return true;
            if(!visited[edge]){
                if(findOrderUtil(edge,graph,visited,stack,stackArr)) return true;
            }

        }
        stackArr[cur]=false;
        stack.push(cur);
        return false;
    }
   
    static int[] findOrder(int n, int m, ArrayList<ArrayList<Integer>> prerequisites)
    {
        // add your code here
        boolean[] visited=new boolean[n];
         boolean[] stackArr=new boolean[n];
        ArrayList<Edge>[] graph=new ArrayList[n];
        for (int i = 0; i <n ; i++) {
            graph[i]=new ArrayList<>();
        }
        for (int i = 0; i <m ; i++) {
           int dest= prerequisites.get(i).get(0);
           int src= prerequisites.get(i).get(1);
           if(dest==src) return new int[0];
            graph[src].add(new Edge(src,dest,1));
        }
        Stack<Integer> stack=new Stack<>();

        for (int i = 0; i <n ; i++) {
            if(!visited[i]){
                if(findOrderUtil(i,graph,visited,stack,stackArr)) return new int[0];
            }
        }
        int[] order=new int[n];
        for(boolean v:visited){
            if(!v){
              
              return new int[0];  
            } 
        }
        int i=0;
        while (!stack.isEmpty()){
            order[i++]=stack.pop();
        }
return order;
    }
}