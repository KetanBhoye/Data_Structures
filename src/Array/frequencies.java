package Array;

public class frequencies {
    public static void main(String[] args) {
        int[] arr ={10,20,30};
        frequencies_in_sorted(arr);
    }
    public static  void frequencies_in_sorted(int[] arr){
        int last = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>last){
                int count = 0;
                last = arr[i];
                for(int j=0;j<arr.length;j++){
                    if(arr[i]==arr[j]){
                      count++;
                    }
                }
                System.out.println(arr[i]+" "+count);

            }

        }
    }
}
