package DSA_Track_1;

import java.util.Scanner;

public class Sum_of_natural_nums {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int n = input.nextInt();
        for (int i = 0; i <=n ; i++) {
            sum +=i;
        }
        System.out.println(sum);
    }
}