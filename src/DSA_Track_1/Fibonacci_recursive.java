package DSA_Track_1;

public class Fibonacci_recursive {
    public static void main(String[] args) {
        System.out.println(fib(5));
    }
    public static int fib(int n){
        if(n<=1) {
            return n;
        }
        else
            return fib(n-1)+fib(n-2);
        }
    }

