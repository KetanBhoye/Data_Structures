package Searching;

public class triplates {
    public static void main(String[] args){
        int[] arr = {2,4,8,9,11,12,20,30};
        int x =10;
    System.out.println(triplate(arr,x));
    }

  public static boolean triplate(int[] arr, int x) {

        for(int k=0;k<arr.length;k++){
            int sum = x-arr[k];
            int i = 0;
            int j = arr.length - 1;
            while (i < j) {
                if (arr[i] + arr[j] == sum) {
                    return true;
                } else if (arr[i] + arr[j] > sum) {
                    j--;
                } else {
                    i++;
                }
            }

        }

    return false;
        }
}
