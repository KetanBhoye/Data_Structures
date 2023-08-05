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

        head = insertAtBegin(head,5);
        head = insertAtEnd(head, 50);
        head = deleteHead(head);
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
  public  static circularList insertAtBegin(circularList head, int x){
       circularList newNode = new circularList(x);

        if(head==null){
           return newNode;
        }
        newNode.next = head;

        circularList curr = head;

        while(curr.next!=head){
            curr = curr.next;
        }
        curr.next = newNode;

        return  newNode;
    }
    public  static circularList insertAtEnd(circularList head,int x){ //suspicious
        circularList newNode = new circularList(x);
        if(head==null){
            return  newNode;
        }
        circularList curr = head;
        while (curr.next!=head){
            curr = curr.next;
        }
        curr.next = newNode;
        newNode.next = head;

        return head;
    }

    public static  circularList deleteHead(circularList head){
        if(head == null){
            return head;
        }
        if(head.next == head){
            return  null;
        }
        head = head.next;
        return head;
    }
}
