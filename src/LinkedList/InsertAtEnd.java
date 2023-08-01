package LinkedList;

public class InsertAtEnd {
    public static void main(String[] args){

        Node head = null;
        head = InsertAtEnd(head,10);
        InsertAtEnd(head,20);
        InsertAtEnd(head,30);
        InsertAtEnd(head,40);
        head = InsertAtBegin.InsertAtBegin(head, 5);

        Node temp = head;

        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
  }

    public static  Node InsertAtEnd(Node head, int x){
        Node tempNode = new Node(x);
        if(head == null){
            return tempNode;
        }
        Node curr = head;
        while(curr.next!=null){
            curr = curr.next;
        }

        curr.next = tempNode;
        return head;

    }
}
