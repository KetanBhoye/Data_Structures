package LinkedList;

public class delLastNode {
    public static void main(String[] args){

    }

    public static Node delLastNode(Node head){

        if(head==null){
            return null;
        }
        if(head.next==null){
             return null;
        }

        Node curr = head;

        while (curr.next.next!=null){
            curr = curr.next;
        }
         curr.next = null;
        return head;
    }

}
