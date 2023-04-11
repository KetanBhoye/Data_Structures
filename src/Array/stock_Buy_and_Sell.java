package Array;

public class stock_Buy_and_Sell {
    public static void main(String[] args) {
        int arr[] = {1, 5, 3, 8, 12};
        System.out.println(get_Profit(arr));

    }
    public static int  get_Profit(int[] arr){
        int profit = 0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[i-1]){
                profit+= arr[i] - arr[i-1];
            }
        }
        return profit;
    }

}
