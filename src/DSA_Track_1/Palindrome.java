package DSA_Track_1;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(palindrome(122));
    }
    public static boolean palindrome(int n){
        int temp = n;
        int rev=0;
        while(temp!=0){
            int lastdigit = temp%10;
            rev = rev*10+lastdigit;
            temp =temp/10;
        }
        return (rev==n);
    }
}
