package Hashing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class arrayByFreq {

public static void main(String[] args){
    int arr[]  ={4,5,4,5,6};
    System.out.println(sortByFreq(arr,arr.length));
}
    static ArrayList<Integer> sortByFreq(int arr[], int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();

        for (int element : arr) {
            map.put(element, map.getOrDefault(element, 0) + 1);
        }

        Collections.sort(list,(n1, n2)->{
            int freq1 = map.get(n1);
            int freq2 = map.get(n2);
            if(freq1!=freq2){
                return freq1-freq2;
            }
            return n1-n2;
        });

        return list;
    }
}
