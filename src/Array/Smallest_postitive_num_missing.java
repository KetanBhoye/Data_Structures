package Array;

public class Smallest_postitive_num_missing {
    public static void main(String[] args) {
       int[] arr = {0,-10,1,3,-20};
        System.out.println(missingNumber(arr));
    }
    static int missingNumber(int arr[])
    {
        // Your code here
        int n = arr.length;

        int max = arr[0];

        for (int i = 0; i<n; i++){

            if (arr[i]<0){

                arr[i]=0;

            }

        }

        for (int i = 1; i<n; i++){

            max = Math.max(arr[i],max);

        }

        max ++;

        for (int i = 0; i<n; i++){



            int x = arr[i]%max;

            if (x<=n && x>=1){

                arr[x-1] = arr[x-1]+max;

            }

        }

        for(int i = 0; i<n;i++){

            arr[i] /= max;

            if (arr[i]==0){

                return i+1;

            }

        }

        return n+1;

    }



}

