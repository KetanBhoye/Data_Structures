package Stack;

import java.util.Stack;

public class deleteMid {
    public static void main(String[] args){
        Stack<Integer>s = new Stack<>();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        delMid(s,((s.size()+1)/2));

    System.out.println(s);
  }

    public static void delMid(Stack<Integer>s,int size){
        if(size==0){
            return;
        }
        int temp = s.pop();
        delMid(s,size-1);
        if(size!=1){
            s.push(temp);
        }
    }

}
