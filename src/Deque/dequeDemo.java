package Deque;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class dequeDemo {
    public static void main(String[] args){
        Deque<Integer>deq =new LinkedList<Integer>();
  //Without Exception Methods
        deq.offerFirst(10);
        deq.offerFirst(20);
        deq.offerFirst(30);
        deq.offerLast(40);
        deq.offerLast(50);
        deq.offerLast(60);
    System.out.println(deq.peekFirst());
    System.out.println(deq.peekLast());
    deq.pollFirst();
    deq.pollLast();
    System.out.println(deq.getFirst());
    System.out.println(deq.getLast());

    //Exception Methods
    deq.removeFirst();
    deq.removeLast();
        deq.addFirst(10);
        deq.addLast(20);
        System.out.println(deq.peekFirst());
        System.out.println(deq.peekLast());

   deq.remove(30);
        //using iterator
        Iterator<Integer>it = deq.iterator();
        while(it.hasNext()){
      System.out.println(it.next()+" ");
        }
        //Using for Each
        for(int i:deq){
      System.out.println(i);
        }

  }
}
