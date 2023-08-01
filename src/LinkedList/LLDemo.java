package LinkedList;


public class LLDemo {
public static void main(String[] args){

    Node head = new Node(30);
    Node N1 = new Node(40);
    Node N2 = new Node(50);
    Node N3 = new Node(60);

    head.next = N1;
    N1.next = N2;
    N2.next = N3;
    printlist(head);

    Node temp = head;

    while(temp!=null){
        System.out.println(temp.data);
        temp = temp.next;
    }

  }
  public static void printlist(Node head){

    //Using Recursion
      Node temp = head;
      if(temp!=null){
      System.out.println(temp.data);
      printlist(temp.next);
      }
      else {
          return;
      }

  }
}
