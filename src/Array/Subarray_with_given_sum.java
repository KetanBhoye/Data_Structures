package Array;

public class Subarray_with_given_sum {
    public static void main(String[] args) {
        int[] arr = {15, 2, 4, 8, 9, 5, 10, 23};
        isSubSum(arr, 23);
    }

    public static int isSubSum(int[] arr, int sum) {
        int curr_sum = arr[0], start = 0, i;
        int n = arr.length;
        for (i = 1; i <= n; i++) {
            // If curr_sum exceeds the sum, then remove the starting elements
            while (curr_sum > sum && start < i - 1) {
                curr_sum = curr_sum - arr[start];
                start++;
            }

            // If curr_sum becomes equal to sum, then return true
            if (curr_sum == sum) {
                int p = i - 1;
                System.out.println("Sum found between indexes " + start
                        + " and " + p);
                return 1;
            }

            // Add this element to curr_sum
            if (i < n)
                curr_sum = curr_sum + arr[i];

        }

        System.out.println("No subarray found");
        return 0;

    }
}
