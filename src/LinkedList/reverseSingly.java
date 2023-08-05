package LinkedList;

public class reverseSingly {
    public static void main(String[] args){
        Node head = new Node(10);
        Node N1 = new Node(20);
        Node N2 = new Node(30);
        Node N3 = new Node(40);

        head.next = N1;
        N1.next = N2;
        N2.next = N3;
        head = reverse(head);
    while (head != null) {
      System.out.println(head.data);
      head = head.next;
    }
        }
    public static Node reverse(Node head){

        if(head==null||head.next==null){
            return head;
        }

        Node curr = head;
        Node prev = null;
        Node next = null;

        while(curr!= null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
