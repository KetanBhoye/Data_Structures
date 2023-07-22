package Strings;

public class checkSubsequence {
    public static void main(String[] args){
    System.out.println(isSubsequence("ketan","kat"));
    }
    public static  boolean isSubsequence(String s,String k){
        int i =0;
        int j =0;
        while (i<s.length()&&j<k.length()){
            if(s.charAt(i)==k.charAt(j)){
                i++;
                j++;
            }
            else {
                i++;
            }
        }
        if(j==k.length()){
            return  true;
        }
        return false;
    }
}
