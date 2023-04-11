package Searching;

public class lastOccurance {
    public static void main(String[] args) {
        int[] arr = {5,10,10,10,15,20,20,20,20,30};
        int start =0;
        int end = arr.length-1;
        int K = 20;
        System.out.println(iterativeLastOccurance(arr,start,end,K));
    }
    public static int iterativeLastOccurance(int[] arr,int start,int end, int K){

        while(start<=end){
            int mid =(start+end)/2;
            if(K>arr[mid]){
                start = mid+1;
            }
            else if(K<arr[mid]){
                start = mid -1;
            }
            else {
                if(mid==arr.length-1||K!=arr[mid+1]){
                    return  mid;
                }
                else {
                    start = mid+1;
                }
            }
        }

return -1;
    }
}
