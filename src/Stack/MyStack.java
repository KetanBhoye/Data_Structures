package Stack;

public class MyStack {
    int[] arr;
   int cap;
    int top;
    MyStack(int c){
        top = -1;
        cap = c;
        arr = new int[c];
    }
     void push(int x){
        if(top>arr.length){
      System.out.println("StackOverflow");
        }
        top++;
        arr[top]=x;
    }
  int pop() {
        if(top<0){
            System.out.println("StackUnderflow");
        }
    int temp = arr[top];
    top--;
    return temp;
        }
        boolean isEmpty(){
        if(top<0){
            return true;
        }
        else {
            return false;
        }
        }
        int peek(){
        if(top<0){
      System.out.println("StackUnderflow");
        }
        return arr[top];
        }
        int size(){
        return top+1;
        }
}
