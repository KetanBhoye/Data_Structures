package Hashing;

import java.util.HashMap;
import java.util.HashSet;

public class givenSumPair {
    public static void main(String[] args){
int arr[] ={ 5,5,5,5};
    System.out.println(optimizedSearchPair(arr,20));
    }
    public static boolean searchPair(int[] arr,int x){


        for(int i = 0; i < arr.length; i++) {
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==x){
                    return true;
                }
            }
        }
        return  false;
    }
    public  static  boolean optimizedSearchPair(int[] arr,int x){
        HashSet<Integer> set = new HashSet<>();
        for(int element: arr){
            if(set.contains(element-x)){
                return  true;
            }
            else {
                set.add(element);
            }

            }
        return false;
        }
    }

