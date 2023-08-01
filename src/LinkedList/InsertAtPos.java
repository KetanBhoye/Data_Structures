package LinkedList;

public class InsertAtPos {
    public static void main(String[] args){

        Node head = new Node(30);
        Node N1 = new Node(40);
        Node N2 = new Node(50);
        Node N3 = new Node(60);

        head.next = N1;
        N1.next = N2;
        N2.next = N3;
    }

    public static Node InsertAtpos(Node head,int pos,int x){
        Node tempNode = new Node(x);
        if(head==null){
            return head;
        }

        Node curr= head;
        for(int i=0;i<=pos;i++){


                Node temp = curr;

            if(pos==i){
                Node  newNode = new Node(x);
                newNode.next = curr;
                temp.next = newNode;
            }
            curr = curr.next;

        }

        return  head;
    }
}
