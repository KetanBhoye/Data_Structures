package Array;

public class is_Sorted
{
    public static void main(String[] args) {
        int[] arr ={54};
        System.out.println(isSorted(arr));
    }
    public static boolean isSorted(int[] arr){

        for (int i = 1; i <arr.length ; i++) {
            if(arr[i]<arr[i-1]){
                return false;
            }
        }
        return true;
    }
}
