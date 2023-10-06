//{ Driver Code Starts
import java.util.*;
import java.lang.*;

class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

class Rearr
{
    static Node head;
    
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t  =sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int a1 = sc.nextInt();
            Node head = new Node(a1);
            Node temp = head;
            for(int i = 1; i < n; i++)
            {
                int a = sc.nextInt();
                temp.next = new Node(a);
                temp = temp.next;
            }
            
            Solution ob = new Solution();
            ob.rearrange(head);
            printLast(head);
            System.out.println();
        }
    }
    
    public static void printLast(Node node)
    {
        while(node != null)
        {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
}
// } Driver Code Ends


/*node class of the linked list
class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}*/
class Solution
{
       public static void rearrange(Node odd)
    {
        // add your code here
        ArrayList<Integer>list = new ArrayList<>();
        boolean flag = false;

        Node curr = odd;
        while(curr.next!=null){
            if(flag){
                curr=curr.next;
                flag = !flag;
            }
            else{

                curr=curr.next;
                list.add(curr.data);
                flag = !flag;
            }
        }

        curr = odd;
        while (curr!=null && curr.next!=null){
            curr.next = curr.next.next;
            curr = curr.next;
        }


        curr = odd;
        while (curr.next!=null){
            curr = curr.next;
        }
        Collections.reverse(list);

        for(int i=0;i<list.size();i++){
            Node temp = new Node(list.get(i));
            curr.next = temp;
            curr = curr.next;

        }
    }
}
