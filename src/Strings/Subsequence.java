package Strings;

public class Subsequence {
    public static void main(String[] args){
        String s ="Ketan";
        findSubsequence(s);
    }
    public static void findSubsequence(String s){

        for(int i=0;i<s.length();i++){
            String t = "";
            for(int j=i;j<s.length();j++){
                t += s.charAt(j);
        System.out.println(t);
            }
        }
    }

}
