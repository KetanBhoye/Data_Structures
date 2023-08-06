package LinkedList;

public class detectLoop {
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
      N6.next = N3;

    System.out.println(detectloop(head));
  }

    public static boolean detectloop(Node head){
        if(head==null){
            return  false;
        }
        if(head.next == head){
            return  true;
        }
        Node slow = head;
        Node fast = head;

        while(fast.next != null){
            slow = slow.next;
            fast= fast.next.next;
            if(fast==slow){
                return true;
            }

        }
        return false;
    }
}
