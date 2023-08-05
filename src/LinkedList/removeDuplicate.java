package LinkedList;

public class removeDuplicate {
    public static void main(String[] args){
        Node head = new Node(10);
        Node N1 = new Node(20);
        Node N2 = new Node (20);
        Node N3 = new Node(30);
        Node N4 = new Node (30);

        head.next = N1;
        N1.next = N2;
        N2.next = N3;
        N3.next = N4;

        head = removeDup(head);
        Node curr = head;
        while(curr!= null){
      System.out.println(curr.data);
      curr = curr.next;
    }
  }

    public static Node removeDup(Node head){
if(head==null || head.next==null){
    return  head;
}

Node curr = head;
while(curr!=null){

    if(curr.data==curr.next.data){
        Node temp = curr.next;
        curr.next = temp.next;
    }
    curr = curr.next;
}

        return  head;
    }
}
