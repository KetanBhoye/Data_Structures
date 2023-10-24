package BST;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class CeilingOnLeftSide {
    public static void main(String[] args){

       int[] arr = {6,18,4,5};
        int res = Integer.MAX_VALUE;
        TreeSet<Integer> ts = new TreeSet<>();

        for(int i =0;i<arr.length;i++){

            res = Math.min(res,ts.ceiling(arr[i])==null?Integer.MAX_VALUE:ts.ceiling(arr[i]));
            ts.add(arr[i]);
        }
    System.out.println(res);
    }
}
