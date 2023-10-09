package  Deque;
class MyCircularDeque {
    class Node {
        int value;
        Node next;
        Node prev;

        Node(int value) {
            this.value = value;
        }
    }

    private Node head;
    private int size;
    private int capacity;

    public MyCircularDeque(int k) {
        capacity = k;
        size = 0;
        head = new Node(-1); // Dummy node
        head.next = head;
        head.prev = head;
    }

    public boolean insertFront(int value) {
        if (size < capacity) {
            Node newNode = new Node(value);
            newNode.next = head.next;
            newNode.prev = head;
            head.next.prev = newNode;
            head.next = newNode;
            size++;
            return true;
        }
        return false;
    }

    public boolean insertLast(int value) {
        if (size < capacity) {
            Node newNode = new Node(value);
            newNode.prev = head.prev;
            newNode.next = head;
            head.prev.next = newNode;
            head.prev = newNode;
            size++;
            return true;
        }
        return false;
    }

    public boolean deleteFront() {
        if (size > 0) {
            Node toDelete = head.next;
            head.next = toDelete.next;
            toDelete.next.prev = head;
            size--;
            return true;
        }
        return false;
    }

    public boolean deleteLast() {
        if (size > 0) {
            Node toDelete = head.prev;
            head.prev = toDelete.prev;
            toDelete.prev.next = head;
            size--;
            return true;
        }
        return false;
    }

    public int getFront() {
        return head.next.value;
    }

    public int getRear() {
        return head.prev.value;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }
}

class MyCircularDeq{
    public static void main(String[] args){
        MyCircularDeque deq = new MyCircularDeque(10);
        deq.insertFront(10);
        deq.insertFront(20);
        deq.insertFront(30);
        deq.insertFront(40);
        deq.insertFront(50);
        deq.insertFront(60);
        deq.insertFront(70);
        deq.insertFront(80);
        deq.insertFront(90);
        deq.insertFront(100);
       // deq.deleteLast();

    }
}
