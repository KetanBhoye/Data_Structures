package Array;

public class secondLargest {
    public static void main(String[] args) {
        int[] arr ={10,30,5,50,25,60,80,90};
        System.out.println(getSecondlargest(arr,arr.length));
    }
    public static int getSecondlargest(int[] arr, int n){
        int secLargest= Integer.MIN_VALUE;
        int largest = 0;
        for(int i=0;i<n;i++){
            if(arr[i]>largest){
                secLargest = largest;
                largest = arr[i];
            }

        }
        return  secLargest;
    }
}
