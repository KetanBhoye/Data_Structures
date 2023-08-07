package LinkedList;

public class deleteWithRandomRef {
    public static void main(String[] args){
        Node head = new Node(10);
        Node N1 = new Node(20);
        Node N2 = new Node(30);
        Node N3 = new Node(40);
        Node N4 = new Node(50);
        Node N5 = new Node(60);

        head.next = N1;
        N1.next =N2;
        N2.next = N3;
        N3.next = N4;
        N4.next = N5;
         deleteRandom(N2);
        Node curr = head;
        while(curr!=null){
      System.out.println(curr.data);
      curr = curr.next;
        }
    }

    public static void deleteRandom(Node ref){

        while(ref.next.next!=null){
            ref.data = ref.next.data;
            ref = ref.next;
        }

        
    }

}
