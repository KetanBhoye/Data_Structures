package Searching;

public class twoPointer {
    public static void main(String[] args){
        int[] arr = {2,4,8,9,11,12,20,30};
        int x =23;
    System.out.println(findPair(arr,x));
    }
    public static boolean findPair(int[] arr, int x){
   int i=0;
   int j= arr.length-1;
        while (i<j){
            if(arr[i]+arr[j]==x){
                return true;
            }
            else if(arr[i]+arr[j]>x){
                j--;
            }
            else {
                i++;
            }
        }
        return  false;

    }
}
