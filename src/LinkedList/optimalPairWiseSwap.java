package LinkedList;

import static LinkedList.LLDemo.printlist;

public class optimalPairWiseSwap {

    public static void main(String[] args){
        Node h = new Node(1);
        Node N1 = new Node(2);
        Node N2 = new Node(2);
        Node N3 = new Node(4);
        Node N4 = new Node(5);
        Node N5 = new Node(6);
        Node N6 = new Node(7);
        Node N7 = new Node(8);

        h.next=N1;
        N1.next=N2;
        N2.next=N3;
        N3.next=N4;
        N4.next= N5;
        N5.next= N6;
        N6.next=N7;
        Node c = OptimalPairSwap(h);
        printlist(c);
    }

    public static Node OptimalPairSwap(Node head){

        if(head==null||head.next==null)
            return head;
        Node curr=head.next.next;
        Node prev=head;
        head=head.next;
        head.next=prev;
        while(curr!=null&&curr.next!=null){
            prev.next=curr.next;
            prev=curr;
            Node next=curr.next.next;
            curr.next.next=curr;
            curr=next;
        }
        prev.next=curr;
        return head;

    }
}
