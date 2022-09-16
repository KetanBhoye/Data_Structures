package DSA_Track_1;

public class Number_of_digits_in_factorial {
    public static void main(String[] args) {
        System.out.println(digitsInFactorial(5000));
    }
    public static int digitsInFactorial(int N){
        // code here
        double res = 0;
        for(int i =1;i<=N;i++){
            res = res+Math.log10(i);

        }
        return (int)(Math.floor(res))+1;
    }
}
