package LinkedList;

public class delFirstNode {
    public static void main(String[] args){

    }
    public static Node delHead(Node head){
        if(head==null){
            return head;

        }

        return  head.next;
    }

}
