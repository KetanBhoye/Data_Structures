package Searching;

import java.util.Arrays;

public class repeatingElement {
    public static void main(String[] args){
        int[] arr = {1,2,3,2,2};
        int slow=arr[0]+1, fast = arr[0]+1;
        do{
            slow = arr[slow]+1;
            fast = arr[arr[fast]+1]+1;

        }
        while (slow!=fast);
        slow = arr[0];

                    }
                }



