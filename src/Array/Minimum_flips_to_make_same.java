package Array;

public class Minimum_flips_to_make_same {
    public static void main(String[] args) {
     int[] arr = {0,0,1,1,0,0,1,1,0,1};
     Print_flips(arr);
    }
    public static void Print_flips(int[] arr){
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[i-1]){
                if(arr[i]!=arr[0]) {
                    System.out.print("From " + i + " to ");
                }

                else {
                    System.out.println(i - 1);
                }

            }

        }
        if(arr[0]!=arr[arr.length-1]){
            System.out.println(arr.length-1);
        }
    }

}
