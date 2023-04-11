package Array;

public class largest_Element {
    public static void main(String args[]){
         int[] arr = {20,30,40,50,10,5,60};
         System.out.println(getLargest(arr,arr.length));
    }
    public  static  int getLargest(int[] arr,int n){
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
        }

        return largest;
    }

}
