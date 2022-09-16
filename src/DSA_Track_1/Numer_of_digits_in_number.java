package DSA_Track_1;

import java.util.Scanner;

public class Numer_of_digits_in_number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int counter = 0;
        while(number !=0){
            number=number/10;
            counter++;
        }
        System.out.println(counter);
    }

}
