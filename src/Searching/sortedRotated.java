package Searching;

public class sortedRotated {
    public static void main(String[] args) {
        int[] arr = {30,40,50,60,10,20};
        int start =0;
        int end = arr.length-1;
        int K = 20;
        System.out.println(findInSortedRotated(arr,start,end,K));
    }
    public static int findInSortedRotated(int[] arr,int start,int end,int K){
        while (start<=end){
            int mid = (start+end)/2;
            if(arr[mid]==K){
                return  mid;
            }
            if(arr[start]<=arr[mid]) {
                if (K >= arr[start] && K <= arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            else {
                if (K > arr[mid] && K <= arr[end]) {
                    start = mid +1;
                }
                else {
                    end = mid -1;
            }
            }
        }
        return -1;
    }
}
