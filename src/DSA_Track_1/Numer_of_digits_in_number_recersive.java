package DSA_Track_1;

public class Numer_of_digits_in_number_recersive {
    public static void main(String[] args) {
        System.out.println(count(123));
    }

  public static int count(long n){
        if(n==0){
            return 0;
        }
return 1+count(n/10);
    }
}
