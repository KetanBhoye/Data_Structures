package LinkedList;

public class pairwiseSwap {
    public static void main(String[] args){
        Node head = new Node(10);
        Node N1 = new Node(20);
        Node N2 = new Node (30);
        Node N3 = new Node(40);
        Node N4 = new Node (50);

        head.next = N1;
        N1.next = N2;
        N2.next = N3;
        N3.next = N4;
        Node curr= head;

        head = pairSwap(head);
        while(curr!=null){
      System.out.println(curr.data);
      curr=curr.next;
        }
    }
    public static Node pairSwap(Node head){
        Node curr = head;

        while(curr!=null&&curr.next!=null){
            int temp = curr.next.data;
            curr.next.data = curr.data;
            curr.data = temp;
            curr = curr.next.next;
        }

        return head;
    }


}
