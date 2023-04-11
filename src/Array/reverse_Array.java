package Array;

import java.util.Arrays;

public class reverse_Array {
    public static void main(String[] args) {
        int[]arr = {5,4,3,2,1};
        System.out.println(Arrays.toString(reverse(arr)));
    }
    public static int[] reverse(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while (start<end){
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start]= temp;
            start++;
            end--;
        }


        return arr;
    }
}
