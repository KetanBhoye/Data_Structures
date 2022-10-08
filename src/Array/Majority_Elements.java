package Array;

public class Majority_Elements {
    public static void main(String[] args) {
        int[] arr ={8,7,6,8,6,6,6,6 };
        System.out.println(isMajority(arr));
        System.out.println(Moores_Voting_algo(arr));

    }
    public static int isMajority(int[] arr){
        int n = (arr.length/2);

        for(int i =0;i<arr.length;i++){
            int count = 0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                    if(count>n){
                        return i;
                    }
                }
            }
        }





        return -1;
    }
    public static int Moores_Voting_algo(int[] arr){
        int res =0, count =1;
        for(int i=1;i<arr.length;i++){
            if(arr[res]==arr[i]){
                count++;
            }
            else
                count--;
            if(count==0){
                res=i;
                count =1;
            }


        }
        count =0;

        for(int i =0;i<arr.length;i++)
            if(arr[res]==arr[i])
                count++;


            if(count<=arr.length/2)
                res= -1;
                return res;

    }
}
