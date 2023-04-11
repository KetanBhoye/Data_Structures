package Searching;

public class firstOccurance {
    public static void main(String[] args) {
        int[] arr = {5,10,10,10,15,20,20,20,20,15,20};
        int start =0;
        int end = arr.length-1;
        int K = 20;
     //   System.out.println(FindOccurance(arr,start,end,K));
        System.out.println(iterativeFirstOccurance(arr,start,end,K));

    }
    public static int FindOccurance(int[] arr,int start, int end, int K){
        int mid = (start+end)/2;
        if(start>end)
            return -1;

        else if(K<arr[mid]){
            return FindOccurance(arr,start,mid-1,K);
        }
        else if(K>arr[mid]){
            return FindOccurance(arr,mid+1,end,K);
        }
        else {
            if(mid==0||arr[mid-1]!=arr[mid])
                return mid;
            else
                return FindOccurance(arr,start,mid-1,K);
        }

    }
    public static int iterativeFirstOccurance(int[] arr,int start, int end, int K){

        while(start<=end){
            int mid = (start+end)/2;
            if(K>arr[mid]){
               start = mid+1;
            }
            else if(K<arr[mid]){
                end = mid-1;            }
            else {
                if(arr[mid]==K||arr[mid-1]!=K){
                    return mid;
                }
                else {
                    end = mid-1;
                }
            }
        }
        return -1;
    }
}
