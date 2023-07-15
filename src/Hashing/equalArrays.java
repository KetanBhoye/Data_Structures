package Hashing;

import java.util.HashMap;

public class equalArrays {
    public static boolean check(long A[],long B[],int N)
    {
        //Your code here
        boolean res = true;
        long j =0;
        HashMap<Long, Long> map = new HashMap<Long,Long>();
        HashMap<Long, Long>map2 = new HashMap<Long,Long>();
        for(int i=0;i<N;i++){
            if(map.containsKey(A[i])){
                map.put(A[i],++j);
            }
            else{
                j =0;
                map.put(A[i],++j);
            }


        }
        j =0;
        for(int i=0;i<N;i++){
            if(map2.containsKey(B[i])){
                map2.put(B[i],++j);
            }
            else{
                j =0;
                map2.put(B[i],++j);
            }


        }
        System.out.println(map);
        System.out.println(map2);
        for (int i =0;i<N;i++){
            if(map.remove(A[i])!=map2.remove(A[i])){
                res = false;
            }

        }


            return res;
    }
    public static void main(String[] args){

        long[] A = { 270, 219, 702, 704, 654, 934, 908, 960, 729, 807, 798, 721, 85, 309, 335, 699, 992, 377, 899, 716, 53, 172, 190, 560, 507, 11, 17, 225, 110, 540, 1, 379, 110, 54, 82, 115, 339, 990, 427, 68, 148, 224, 788, 232, 533, 123, 282, 876, 851, 180, 591, 255, 351, 132, 814, 858, 495, 182, 82, 604, 721, 434, 983, 182, 488, 416, 297, 826, 405, 723, 893, 552, 298, 33, 135, 182, 507 };
        long[] B = { 934, 560, 876, 115, 110, 604, 309, 699, 54, 255, 495, 960, 232, 721, 533, 405, 826, 488, 540, 351, 814, 270, 992, 798, 82, 416, 721, 908, 11, 298, 379, 224, 983, 110, 17, 297, 335, 225, 1, 190, 377, 702, 182, 33, 132, 182, 899, 704, 893, 219, 851, 507, 858, 807, 172, 990, 788, 339, 654, 282, 68, 427, 53, 434, 123, 552, 716, 723, 507, 85, 729, 148, 82, 135, 180, 182, 591 };
        int N = A.length;

        boolean result = check(A, B, N);
        System.out.println(result);

    }
}
