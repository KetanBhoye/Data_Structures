package Sorting;

import java.util.Arrays;

public class minimumDiffrance {
    public static void main(String[] args){
        int arr[] = {10,3,20,12};
        //3 10 12 20
        new minimumDiffrance(arr);
    }
minimumDiffrance(int[] a){
    Arrays.sort(a);
    int res = Integer.MAX_VALUE;
    for(int i=1;i<a.length;i++){
        res = Math.min(a[i]-a[i-1],res);
    }
    System.out.println(res);
}

}
