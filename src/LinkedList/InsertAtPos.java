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
        head = InsertAtpos(head,1,55);
        Node temp = head;

        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }

    }

    public static Node InsertAtpos(Node head,int pos,int x){
        Node tempNode = new Node(x);
        Node curr = head;
        if(pos==1){
            tempNode.next = curr;
            return tempNode;
        }


        for(int i=1;i<=pos;i++){

                Node temp = head;
                if(curr==null){
                    return head;
                }
            if(pos-1==i){

                tempNode.next = curr.next;
                temp.next = tempNode;

            }
            curr = curr.next;

        }

        return  head;
    }
}
