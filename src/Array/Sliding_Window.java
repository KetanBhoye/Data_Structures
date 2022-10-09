package Array;

public class Sliding_Window {
    public static void main(String[] args) {
        int arr[] = {1,8,30,-5,20,7};
        System.out.println(GetSum(arr,3));
    }
    public static int GetSum(int[] arr, int k){
     int curr =0;
     for(int i=0;i<k;i++){
         curr+=arr[i];
     }
     int res = curr;
     for(int i=k;i<arr.length;i++){
         curr =curr+arr[i]-arr[i-k];
         res = Math.max(curr,res);
     }
     return res;
    }
}
