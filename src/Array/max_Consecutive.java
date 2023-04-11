package Array;

public class max_Consecutive {
    public static void main(String[] args) {
        int arr[] = {0,1,1,1,0,1,1};
        System.out.println(get_maxConsecutive(arr));
    }
    public static  int get_maxConsecutive(int[] arr){
        int count = 0;
        int temp = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                temp++;
                count = Math.max(temp,count);
            }

            else {

                temp = 0;
            }
        }
        return count;
    }
}
