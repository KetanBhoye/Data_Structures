package Queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class demoQueue {
    public static void main(String[] args){
        Queue<Integer>Q = new ArrayDeque<Integer>();
        Q.offer(10);
        Q.offer(20);
        Q.offer(30);
        Q.offer(40);
        Q.offer(50);
        Q.offer(60);
        Q.offer(70);
        Q.offer(80);
    System.out.println(Q);
    System.out.println(Q.peek());
    System.out.println(Q.poll());
    System.out.println(Q.peek());
    }
}

