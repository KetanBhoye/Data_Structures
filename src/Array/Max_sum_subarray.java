package Array;

public class Max_sum_subarray {
    public static void main(String[] args) {
        int[] arr = {1,-2,3,-1,2};
        System.out.println(maxSum(arr));
    }

    static int maxSum(int arr[])
    {
        int res = arr[0];

        int maxEnding = arr[0];

        for(int i = 1; i < arr.length; i++)
        {
            maxEnding = Math.max(maxEnding + arr[i], arr[i]);

            res = Math.max(maxEnding, res);
        }

        return res;
    }
}
