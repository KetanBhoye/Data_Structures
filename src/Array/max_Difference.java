package Array;

public class max_Difference {
    public static void main(String[] args) {
        int[] arr = {30,10,8,2};
        System.out.println(cal_Difference(arr));

    }
    public static  int cal_Difference(int[] arr){
        int max_Diff =arr[1]-arr[0];
        int min_val = arr[0];
        for (int i = 1; i < arr.length; i++) {
            max_Diff = Math.max(max_Diff,arr[i]-min_val);
            min_val = Math.min(min_val,arr[i]);

        }

        return max_Diff;
    }
}
