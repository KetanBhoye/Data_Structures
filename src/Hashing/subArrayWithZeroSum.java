package Hashing;

import java.util.HashSet;

public class subArrayWithZeroSum {
    public static void main(String[] args){
        int[] arr= {1,1,1};
    System.out.println(findSubArray(arr));
    }

  public static boolean findSubArray(int[] arr) {
    HashSet<Integer> set = new HashSet<>();
    int prefixSum = 0;
    for (int i = 0; i < arr.length; i++) {

      prefixSum += arr[i];
      if (set.contains(prefixSum) || arr[i] == 0 || prefixSum == 0) {
        return true;
      }

      set.add(prefixSum);
    }

    return false;
        }
}
