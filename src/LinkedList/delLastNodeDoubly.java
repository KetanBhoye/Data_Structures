package LinkedList;

public class delLastNodeDoubly {
    public static void main(String[] args){
        doublyNode head = new doublyNode(10);
        doublyNode N1 = new doublyNode(20);
        doublyNode N2 = new doublyNode(30);
        head.next = N1;
        N1.next = N2;
        N1.prev = head;
        N2.prev = N1;
        head = delLastNode(head);
        while (head!=null){
            System.out.println(head.data);
            head = head.next;
        }
    }
    public static doublyNode delLastNode(doublyNode head){

        if(head==null){
            return head;
        }
        if(head.next==null){
            return  null;
        }
        else {
            doublyNode curr= head;
            while (curr.next!=null){
                curr = curr.next;
            }
            curr.prev.next = null;
        }
        return head;
    }

}
