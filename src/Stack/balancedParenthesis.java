package Stack;

import java.util.ArrayDeque;

public class balancedParenthesis {
    public static void main(String[] args){
        String s ="[(])";
    System.out.println(isValid(s));
    }
    public static boolean isValid(String str){
        ArrayDeque<Character>S = new ArrayDeque<>();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='{'){
                S.push(str.charAt(i));
            }
            else if(str.charAt(i)=='('){
                S.push(str.charAt(i));
            }
            else if(str.charAt(i)=='['){
                S.push(str.charAt(i));
            }
            else if(str.charAt(i)=='}'){
                if(S.peek()=='{'){
                    S.pop();
                }
                else {
                    return false;
                }
            }
            else if(str.charAt(i)==')'){

                if(S.peek()=='('){
                    S.pop();
                }
                else {
                    return false;
                }
            }
            else if(str.charAt(i)==']'){

                if(S.peek()=='['){
                    S.pop();
                }
                else {
                    return false;
                }
            }
        }
        return S.isEmpty();
    }
}
