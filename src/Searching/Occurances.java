package Searching;
import Searching.firstOccurance.*;
import Searching.lastOccurance.*;
public class Occurances {
    public static void main(String[] args) {
        System.out.println(IterativeOccurances());

    }
    public static  int IterativeOccurances(){

        int[] arr = {5,10,10,10,15,20,20,20,20,20};
        int start =0;
        int end = arr.length-1;
        int K = 20;
        int res = firstOccurance.FindOccurance(arr,start,end,K);
        if(res==-1){
            return 0;
        }
        else {
            return lastOccurance.iterativeLastOccurance(arr,start,end,K)-res+1;
        }
    }
}
