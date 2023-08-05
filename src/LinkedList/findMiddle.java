package LinkedList;

public class findMiddle {

    public static void main(String[] args){
        Node head = new Node(10);
        Node N1 = new Node(20);
        Node N2 = new Node(30);
        Node N3 = new Node(40);

        head.next = N1;
        N1.next = N2;
        N2.next = N3;


        find(head);

    }
    public  static  Node find(Node head){
        if(head==null||head.next==null){
            return head;
        }

        Node curr = head;
        Node fast = head;
        while (fast!= null){
            curr = curr.next;
            fast = curr.next.next;

            if(fast==null){
        System.out.println(curr.data);
            }
        }


return  head;
    }

}
