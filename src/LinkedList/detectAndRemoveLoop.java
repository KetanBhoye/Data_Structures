package LinkedList;

public class detectAndRemoveLoop {
    public static void main(String[] args){
        Node head = new Node(10);
        Node N1 = new Node(20);
        Node N2 = new Node(30);
        Node N3 = new Node(40);
        Node N4 = new Node( 50);
        Node N5 = new Node(60);
        Node N6 = new Node(70);

        head.next = N1;
        N1.next = N2;
        N2.next = N3;
        N3.next = N4;
        N4.next = N5;
        N5.next = N6;
        N6.next = N2;
        removeLoop(head);
        while(head!= null){
      System.out.println(head.data);
      head = head.next;
        }
    }
    public static void removeLoop(Node head){
        if(head==null){
            return;
        }
        if(head.next==head){
            head.next = null;
        }

        Node fast = head;
        Node slow = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;

      if (fast == slow) {
        break;
            }
        }
        slow = head;
        while(slow.next!=fast.next){
            fast= fast.next;
            slow = slow.next;
        }
        fast.next = null;

    }
}
