package Deque;

import java.util.ArrayList;

public class maximumOfAllSubArray {
    public static void main(String[] args){
        int[] arr = {10, 8, 5, 12, 15, 7,18};
    System.out.println(findMax(arr,3));
    }
    public static ArrayList<Integer>findMax(int[] arr,int k){
        int n = arr.length;
        ArrayList<Integer>list = new ArrayList<>();
     int i,j =0;
         for( i=0;i<n-k+1;i++){
             int max = arr[j];
             for( j=i;j<=i+k-1;j++){
                 max = Math.max(max,arr[j]);

             }
             list.add(max);
         }

         return list;
    }
}
