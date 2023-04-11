package DSA_Track_1;

import java.util.Scanner;

public class String_palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
     String str=input.nextLine();
        System.out.println(isPalindrome(str,0,str.length()-1));
    }
    public static boolean isPalindrome(String str,int start,int end){

        if(start>=end){
            return true;
        }
        return str.charAt(start)==str.charAt(end) && isPalindrome(str,start+1,end-1);
    }
}
