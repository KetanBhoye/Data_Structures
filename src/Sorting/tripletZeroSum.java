package Sorting;

import java.util.Arrays;

public class tripletZeroSum {
    public static void main(String[] args){
        int arr[] =  {0, -1, 2, -3, 1};
        new tripletZeroSum(arr);
    }
    tripletZeroSum(int arr[]){
        Arrays.sort(arr);

        for(int i = 0; i < arr.length; i++) {
            int letft =i+1;
            int right = arr.length-1;
      while (letft < right) {
          int sum =arr[i] + arr[letft] + arr[right];
        if (sum == 0) {
          System.out.println("1");
          return;
        }
        if (sum > 0) {
            right--;
        }
        else {
            letft++;
        }
      }
    }
    System.out.println("0");
    }
}
