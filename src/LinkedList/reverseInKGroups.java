package LinkedList;

public class reverseInKGroups {
    public static void main(String[] args){
        Node head = new Node(10);
        Node N1 = new Node(20);
        Node N2 = new Node(30);
        Node N3 = new Node(40);
        Node N4 = new Node( 50);
        Node N5 = new Node(60);
        Node N6 = new Node(70);

        head.next = N1;
        N1.next = N2;
        N2.next = N3;
        N3.next = N4;
        N4.next = N5;
        N5.next = N6;
        head =  reverseInKgrp(head,3);

        while (head != null) {
            System.out.println(head.data);
            head = head.next;
        }
    }

    public static Node reverseInKgrp(Node head, int k){

        Node curr = head;
        Node next = null;
        Node prev = null;
        int count =0;
        while(curr!=null&& count<k){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            count++;
        }
        if(next!=null){
           head.next =reverseInKgrp(next,k);
        }
        return  prev;
    }

    public  static Node reverseInK(Node head,int k){
        Node prevFirst = null;
        Node curr = head;
        boolean isFirstpass = true;
        while(curr!=null){
            Node first = curr;
            Node prev = null;
            int count =0;
            while(curr!=null&&count<k){

                Node next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
                count++;
            }
            if(isFirstpass){
                head = prev;
                isFirstpass = false;
            }
            else {
                prevFirst.next = prev;
            }
            prevFirst = first;
        }
        return head;
    }

}
