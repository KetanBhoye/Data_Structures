package LinkedList;

public class circularLinkedList {
    public static void main(String[] args){
        circularList head = new circularList(10);
        circularList N1 = new circularList(20);
        circularList N2 = new circularList(30);
        circularList N3 = new circularList(40);
        head.next = N1;
        N1.next = N2;
        N2.next = N3;
        N3.next = head;

        traverse(head);

    }
    public static circularList traverse(circularList head){
        if(head==null){
            return  head;
        }
    System.out.println(head.data);
        for(circularList curr=head.next;curr.next!=head;curr=curr.next){
      System.out.println(curr.data);
        }
        return head;
  }
}
