package Strings;

public class checkPalindrome {
    public static void main(String[] args){
    System.out.println(isPalindrome("kaak"));
    }
    public static  boolean isPalindrome(String s){
     int begin =0;
     int end = s.length()-1;
     while(begin<end){
         if(s.charAt(begin)!=s.charAt(end)){
             return  false;
         }
         else{
             begin++;
             end--;
         }
     }
return  true;
    }
}
