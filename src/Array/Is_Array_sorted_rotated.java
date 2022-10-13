package Array;

public class Is_Array_sorted_rotated {
    public static void main(String[] args) {
     int[] arr  = {3,4,1,2};
        System.out.println(is_Sorted_Rotated(arr));
    }
    public static boolean  is_Sorted_Rotated(int[] arr){
       int n= arr.length;
        int count1=0,count2=0;


        for(int i=0;i<n-1;i++) {
            //if the array is in increasing order

            if(arr[i] > arr[i+1] && arr[0]>arr[n-1])

                count1++;

            //if the array is sort in decresing order

            if(arr[i] < arr[i+1] && arr[0]<arr[n-1])

                count2++;

        }



        if(count1==1 || count2==1)

            return true;

        else

            return false;

    }
}
