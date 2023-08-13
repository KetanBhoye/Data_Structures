package Stack;

class TwoStack{
    int[] arr;
    int top1;
    int top2;
    int cap;
    int size1;
    int size2;
    TwoStack(int c){
        top1 = -1;
        top2 = c;
        cap = c;
        arr = new int[c];
        size1 = c;
        size2 = c;
    }
    public void push1(int x){
        if(top1<top2-1){
            top1++;
            arr[top1] =x;
        }
        size1--;
    }
    public  void push2(int x){
        if(top1<top2){
            top2--;
            arr[top2]=x;
        }
        size2--;

    }
    public int pop1(){
        if(top1<0){
            return  -1;
        }
        else {
            int temp = arr[top1];
            top1--;
            return temp;
        }

    }
    public int pop2(){
        if(top2<cap){
            int temp = arr[top2];
            top2++;
            return temp;

        }
        else {
            return -1;
        }

    }
    public int seek1(){
        if(top1>=0){
            return arr[top1];
        }
        else
            return -1;
    }
    public int seek2(){
        if(top2<cap){
            return arr[top2];
        }
        else
            return -1;
    }

}

public class twoStacks {
    public static void main(String[] args){


       TwoStack S = new TwoStack(6);

       S.push1(5);
       S.push2(-5);
       S.push1(10);
       S.push2(-10);
       System.out.println(S.pop1());
    System.out.println(S.pop2());
    }
}
