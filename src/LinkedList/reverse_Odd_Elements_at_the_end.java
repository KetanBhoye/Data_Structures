package LinkedList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static LinkedList.LLDemo.printlist;
import static LinkedList.reverseSingly.reverse;

public class reverse_Odd_Elements_at_the_end {

    public static void main(String[] args){
        Node head = new Node(10);
        Node N1 = new Node(4);
        Node N2 = new Node(9);
        Node N3 = new Node(1);
        Node N4 = new Node(3);
        Node N5 = new Node(5);
        Node N6 = new Node(9);
        Node N7 = new Node(4);

        head.next=N1;
        N1.next=N2;
        N2.next=N3;
        N3.next=N4;
        N4.next= N5;
        N5.next= N6;
        N6.next=N7;
        OptiRearrenge(head);

        while (head!=null){
      System.out.print(head.data+" ");
      head= head.next;
        }

    }


    public static void rearrange(Node odd)
    {
        // add your code here
        ArrayList<Integer>list = new ArrayList<>();
        boolean flag = false;

        Node curr = odd;
        while(curr.next!=null){
            if(flag){
                curr=curr.next;
                flag = !flag;
            }
            else{

                curr=curr.next;
                list.add(curr.data);
                flag = !flag;
            }
        }

        curr = odd;
        while (curr!=null && curr.next!=null){
            curr.next = curr.next.next;
            curr = curr.next;
        }


        curr = odd;
        while (curr.next!=null){
            curr = curr.next;
        }
        Collections.reverse(list);

        for(int i=0;i<list.size();i++){
            Node temp = new Node(list.get(i));
            curr.next = temp;
            curr = curr.next;

        }
    }

    public static void OptiRearrenge(Node odd){

        Node t1 = odd;
        Node t2 = odd.next;
        Node temp = t2;
        while(t1.next!=null&&t2.next!=null){

            t1.next = t2.next;
            t1 = t1.next;
            t2.next = t1.next;
            t2 = t2.next;
            t1.next = t2;
        }
        t2 = temp;
       reverse(t2);
       t1.next = t2;

    }
}
