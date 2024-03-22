//{ Driver Code Starts
//Initial Template for Java

import java.util.LinkedList; 
import java.util.Queue; 
import java.io.*;
import java.util.*;

class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}

class GfG {
    
    static Node buildTree(String str){
        
        if(str.length()==0 || str.charAt(0)=='N'){
            return null;
        }
        
        String ip[] = str.split(" ");
        // Create the root of the tree
        Node root = new Node(Integer.parseInt(ip[0]));
        // Push the root to the queue
        
        Queue<Node> queue = new LinkedList<>(); 
        
        queue.add(root);
        // Starting from the second element
        
        int i = 1;
        while(queue.size()>0 && i < ip.length) {
            
            // Get and remove the front of the queue
            Node currNode = queue.peek();
            queue.remove();
                
            // Get the current node's value from the string
            String currVal = ip[i];
                
            // If the left child is not null
            if(!currVal.equals("N")) {
                    
                // Create the left child for the current node
                currNode.left = new Node(Integer.parseInt(currVal));
                // Push it to the queue
                queue.add(currNode.left);
            }
                
            // For the right child
            i++;
            if(i >= ip.length)
                break;
                
            currVal = ip[i];
                
            // If the right child is not null
            if(!currVal.equals("N")) {
                    
                // Create the right child for the current node
                currNode.right = new Node(Integer.parseInt(currVal));
                    
                // Push it to the queue
                queue.add(currNode.right);
            }
            i++;
        }
        
        return root;
    }
    static void printInorder(Node root)
    {
        if(root == null)
            return;
            
        printInorder(root.left);
        System.out.print(root.data+" ");
        
        printInorder(root.right);
    }
    
	public static void main (String[] args) throws IOException{
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        
	        int t=Integer.parseInt(br.readLine());
    
	        while(t > 0)
	        {
	            String s = br.readLine();
    	    	Node root = buildTree(s);
        	    Tree g = new Tree();
			    ArrayList <Integer> res = g.diagonalSum(root);
			    for (Integer num : res) System.out.print(num + " ");
			    System.out.println();
                t--;
            
        }
    }
  
}


// } Driver Code Ends


/*Complete the function below
Node is as follows:
class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}
*/
class Tree {
    public static ArrayList<Integer> diagonalSum(Node root) {
        ArrayList<Integer> result = new ArrayList<>();
        if (root == null)
            return result;

        HashMap<Integer, Integer> diagonalSums = new HashMap<>();

        diagonalSumHelper(root, 0, diagonalSums);

        // Convert diagonal sums from HashMap to ArrayList
        for (int i = 0; i < diagonalSums.size(); i++) {
            if (diagonalSums.containsKey(i)) {
                result.add(diagonalSums.get(i));
            }
        }

        return result;
    }

    // Helper function to calculate diagonal sums recursively
    private static void diagonalSumHelper(Node node, int diagonalLevel, HashMap<Integer, Integer> diagonalSums) {
        if (node == null)
            return;

        // Add current node's value to the diagonal sum
        diagonalSums.put(diagonalLevel, diagonalSums.getOrDefault(diagonalLevel, 0) + node.data);

        // Recur for the left child with increased diagonal level
        diagonalSumHelper(node.left, diagonalLevel + 1, diagonalSums);

        // Recur for the right child with same diagonal level
        diagonalSumHelper(node.right, diagonalLevel, diagonalSums);
    }
}
