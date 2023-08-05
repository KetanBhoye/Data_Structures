package LinkedList;

public class sortedInsert_Singly {
    public static void main(String[] args){

        Node head = new Node(10);
        Node N1 = new Node(20);
        Node N2 = new Node(30);
        Node N3 = new Node(40);

        head.next = N1;
        N1.next = N2;
        N2.next = N3;
        head = sortedInsert(head,10);
        while (head!=null){
            System.out.println(head.data);
            head = head.next;
        }

    }
    public  static Node sortedInsert(Node head, int x){
        Node newNode = new Node(x);
        if(head==null){
            return newNode;
        }

        Node curr = head;
        while(curr.next!=null && curr.next.data<x){
            curr = curr.next;
        }
        newNode.next = curr.next;
        curr.next = newNode;



        return head;
    }
}
