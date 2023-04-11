package Array;

import java.util.Arrays;

public class move_Zeros_to_end {
    public static void main(String[] args) {
        int[] arr = {8 ,-8, 9, -9, 10, -11, 12};

        System.out.println(minAdjDiff(arr,arr.length));

    }
    public static void Rearrange(int[] arr){
        int count = 0;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]!=0){
                int temp = arr[i];
                arr[i]= arr[count];
                arr[count] = temp;
                count++;
            }
        }
        }
    public static int minAdjDiff(int arr[], int n) {
        int minVar = Integer.MAX_VALUE;

        for(int i =1;i<n;i++){
            if(i==n-1){
                minVar = Math.min(minVar,Math.abs(arr[n-1]-arr[0]));
            }
            minVar = Math.min(minVar,Math.abs(arr[i-1]-arr[i]));

        }

        // Your code here
        return minVar;
    }
    }

