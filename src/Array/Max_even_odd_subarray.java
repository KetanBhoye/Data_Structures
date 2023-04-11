package Array;

public class Max_even_odd_subarray {
    public static void main(String[] args) {
        int[] arr = {74,80,8,13,37,49,20,6};
        System.out.println(get_Subarray(arr));
    }
    static  int get_Subarray(int[] arr){
        int count = 1;
        int curr = 1;
        for(int i=1;i<arr.length;i++){

            if(arr[i-1]%2==0&&arr[i]%2!=0 || arr[i-1]%2!=0&&arr[i]%2==0){
                curr++;
            }
            else {
                curr = 1;
            }
            count = Math.max(curr,count);
        }




        return count;
    }
}
