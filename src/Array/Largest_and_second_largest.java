package Array;

import java.util.ArrayList;

public class Largest_and_second_largest {
    public static void main(String[] args) {
        int[] arr ={1000,1000,1000,1000,100};
        System.out.println(large_seclarge(arr));
    }

    public static ArrayList<Integer> large_seclarge(int[] arr){
        ArrayList<Integer> list = new ArrayList<Integer>();
        int res = -1;
        int largest =0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[largest]){
                res = largest;
                largest = i;
            } else if (arr[i] != arr[largest]) {
                if (res == -1 || arr[i]>arr[res]) {
                    res = i;

                }

            }
        }
        list.add(largest);
        list.add(res);


        return list;
    }
}
