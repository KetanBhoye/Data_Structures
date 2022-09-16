package Array;

import java.util.ArrayList;
import java.util.Collections;

public class Leaders_in_array {
    public static void main(String[] args) {
        int[] arr = {7,10,4,10,6,5,2};
        isLeader(arr);
    }
    public static void   isLeader(int[] arr){

     int curr_leader = arr[arr.length-1];
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(curr_leader);
        for(int i=arr.length-2;i>0;i--){
            if(curr_leader<arr[i]){
                curr_leader = arr[i];
                list.add(curr_leader);
            }
        }
      Collections.reverse(list);
        System.out.println(list);

    }
}
