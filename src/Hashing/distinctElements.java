package Hashing;

import java.util.HashSet;

public class distinctElements {
    public static void main(String[] args){
    int[] arr = {1,2,3,4,5};
    int[] arr2 ={1,2,3,1,2,3};
    System.out.println(countDist(arr2));
    }
    public static int countDist(int[] arr){
        HashSet<Integer> set = new HashSet<>();
        for(int i =0; i<arr.length;i++){
            set.add(arr[i]);
        }
        return set.size();
    }
}
