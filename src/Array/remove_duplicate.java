package Array;

import java.util.Arrays;

public class remove_duplicate {
    public static void main(String[] args) {
        int[] arr ={10,20,20,30,30,30,40,50};
        System.out.println(remduplicate(arr,arr.length));
    }
    public static int remduplicate(int[] arr , int len){
        int count = 1;
        for(int i=0;i<len;i++){
            if(arr[count-1]!=arr[i]){
                arr[count]=arr[i];
                count++;
            }




        }
        System.out.println(Arrays.toString(arr));
        return count;
    }
}
