package LinkedList;

public class InsertAtBegin{
    public static void main(String[] args){

    Node head = null;
       head = InsertAtBegin(head,10);
        head = InsertAtBegin(head,10);
        head = InsertAtBegin(head,30);
    System.out.println(head.data);
    }
   public static Node InsertAtBegin(Node head, int x){
        Node temp = head;

        Node tempNode = new Node(x);
        tempNode.next = temp;
        return  tempNode;
    }

}
