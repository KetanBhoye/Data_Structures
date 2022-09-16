package Array;

public class largest_element_in_array {
    public static void main(String[] args) {
        int[]  arr = {2,2,3,8,2,6};
        System.out.println(largest(arr));
    }
    public static int largest(int[] arr){
        int largest=0;

        for (int i = 0; i <=arr.length -1; i++) {
            if(arr[i]>arr[largest]){
                largest =i;


            }

        }

        return largest;

    }
}
