package Hashing;

import java.util.HashMap;

public class freqArray {
    public static void main(String[] args){
        int[] arr ={1,1,2,2,3,3,4,4,5};
        calculate(arr);
    }
    public static void calculate(int[] arr){
        HashMap<Integer,Integer>map = new HashMap<>();
        int j =0;
        for(int i = 0; i < arr.length; i++) {
            if(map.containsKey(arr[i])){
                map.put(arr[i],++j);
            }
            else {
                j = 0;
                map.put(arr[i],++j);
            }
        }
    System.out.println(map);
    }
}
