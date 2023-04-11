package Searching;

public class Count1s {
    public static void main(String[] args) {
        int[] arr = {0,0,0,0,1,1,1,1,1,};
        int count =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                count++;
            }
        }
        System.out.println(arr.length-count);

    }
}
