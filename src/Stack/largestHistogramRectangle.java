package Stack;

public class largestHistogramRectangle {
    public static void main(String[] args){
        int[] arr = new int[]{2,2};
    System.out.println(largestRectangle(arr,arr.length));
    }
    public static int largestRectangle(int[] arr, int n){
        int area = 0;
        for(int i=0;i<arr.length;i++){
            int curr = arr[i];
            for(int j=i-1;j>=0;j--){
                if(arr[i]<=arr[j]){
                    curr+= arr[i];
                }
                else{
                    break;
                }
            }
            for(int j=i+1;j<n;j++){
                if(arr[i]<=arr[j]){
                    curr+=arr[i];
                }
                else {
                    break;
                }
            }
            area = Math.max(area,curr);
        }
        return area;
    }
}
