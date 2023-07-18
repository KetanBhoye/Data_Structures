package Hashing;

import java.util.HashMap;
import java.util.Map;

public class freqArray {
    public static void main(String[] args){
        int[] arr ={1,1,2,2,3,3,4,4,5};
        calculate(arr);
    }
    public static void calculate(int[] arr){
        HashMap<Integer,Integer>map = new HashMap<>();
        int j =0;
        for(int x : arr) {
        map.put(x,map.getOrDefault(x,0)+1);
        }
        System.out.println(map.get(1));
  for(Map.Entry<Integer,Integer>e: map.entrySet()){
      System.out.println(e.getKey()+" -> "+e.getValue());

  }

    }
}
