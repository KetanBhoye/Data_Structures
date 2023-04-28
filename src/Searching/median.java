package Searching;

import java.util.Arrays;

public class median {
  public static void main(String[] args) {
    int[] arr1 = {10, 20, 30};
    int[] arr2 = {5, 15, 25}; // 5 10 15 20 25 30
    System.out.println(findMedian(arr1, arr2));
        }
        public static double findMedian(int[] arr1, int[] arr2) {
            int[] temp = new int[arr1.length + arr2.length];
            System.arraycopy(arr1, 0, temp, 0, arr1.length);
            System.arraycopy(arr2, 0, temp, arr1.length, arr2.length);

            Arrays.sort(temp);

            int mid = temp.length / 2;
            if (temp.length % 2 == 0) {
                return (double) (temp[mid - 1] + temp[mid]) / 2.0;
            } else {
                return (double) temp[mid];
            }
        }
    }
