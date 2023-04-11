package Array;

public class second_largest {
    public static void main(String[] args) {
       int[] arr = {10,10,10};
        System.out.println(sec_large(arr));
    }
    public static int  sec_large(int[] arr){
        int largest =0;
        int sec_large =0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>arr[largest]){
                largest = i;
            }

        }
        for(int j=0;j<arr.length;j++){
            if(arr[j]<arr[largest] && arr[j]>arr[sec_large]){
                sec_large =j;
            }

        }
        return sec_large;
    }
}
