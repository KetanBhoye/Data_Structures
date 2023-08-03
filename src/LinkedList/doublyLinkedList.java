package LinkedList;

public class doublyLinkedList {
    public static void main(String[] args){

        doublyNode head = new doublyNode(10);
        doublyNode N1 = new doublyNode(20);
        doublyNode N2 = new doublyNode(30);
         head.next = N1;
         N1.next = N2;
         N1.prev = head;
         N2.prev = N1;
        head = insertAtBegin(head,5);

         head = insertAtEnd(head,40);
        doublyNode curr = head;
         while (curr!=null){
      System.out.println(curr.data);
      curr = curr.next;
         }
    }

    public  static doublyNode insertAtBegin(doublyNode head, int x){

        doublyNode newNode = new doublyNode(x);
        if(head == null){
            return  newNode;
        }
        else {
            newNode.next = head;
            head.prev = newNode;
            return newNode;
        }
            }

    public static  doublyNode insertAtEnd(doublyNode head, int x){


        doublyNode newNode = new doublyNode(x);

        if(head==null){
            return  newNode;
        }
        doublyNode curr = head;

        while (curr.next!= null){
            curr= curr.next;
        }
        curr.next = newNode;
        newNode.prev = curr;

        return head;
    }

}
