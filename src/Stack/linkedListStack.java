package Stack;
class Node{
    int data;
    Node next;
    Node(int x){

        data = x;
        next = null;
    }
}

public class linkedListStack {
    Node head;
    int size;

    linkedListStack(){
        size = 0;
        head = null;
    }

    void push(int x){
        Node temp = new Node(x);
        temp.next = head;
        head = temp;
        size++;
    }
    int pop(){
        if(head==null){
      System.out.println("StackUnderflow");
        }
int res = head.data;
        head = head.next;
        size--;
        return res;
    }
    int peek(){
        if(head==null){
      System.out.println("StackUnderflow");
        }
        return head.data;
    }
    int size(){
        return  size;
    }

    boolean isEmpty(){
        return (head==null);
    }


}
