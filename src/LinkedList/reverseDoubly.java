package LinkedList;

import static LinkedList.doublyLinkedList.insertAtBegin;
import static LinkedList.doublyLinkedList.insertAtEnd;

public class reverseDoubly {
    public static void main(String[] args){

        doublyNode head = new doublyNode(10);
        doublyNode N1 = new doublyNode(20);
        doublyNode N2 = new doublyNode(30);
        head.next = N1;
        N1.next = N2;
        N1.prev = head;
        N2.prev = N1;


        head = reverse(head);
        doublyNode curr = head;

        while (curr!=null){
            System.out.println(curr.data);
            curr = curr.next;
        }
    }

    public  static doublyNode reverse(doublyNode head){
        if(head.next==null){
            return head;
        }

        doublyNode curr = head;
        doublyNode prev = null;
        while(curr!=null){

            prev = curr.prev;
            curr.prev = curr.next;
            curr.next = prev;
            curr = curr.prev;


        }
        prev = prev.prev;


        return prev;

    }

}
