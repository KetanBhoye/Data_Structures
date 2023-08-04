package LinkedList;

public class delFirstNodeDoubly {
    public static void main(String[] args){
        doublyNode head = new doublyNode(10);
        doublyNode N1 = new doublyNode(20);
        doublyNode N2 = new doublyNode(30);
        head.next = N1;
        N1.next = N2;
        N1.prev = head;
        N2.prev = N1;
        head = delFirstNode(head);
        while (head!=null){
            System.out.println(head.data);
            head = head.next;
        }
    }


    public static  doublyNode delFirstNode(doublyNode head){

        if(head==null){
            return  null;
        }
        if(head.next==null){
            return null;
        }

       else {
            head = head.next;
            head.prev = null;
            return head;
        }
    }

}
