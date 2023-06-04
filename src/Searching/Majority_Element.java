package Searching;

public class Majority_Element {

    public static void main(String[] args){
        int[] arr = {1,2,3,3,3,5,6,0};
        int N = arr.length;
    System.out.println(majorityElement(arr,N));
    }
    static int majorityElement(int a[], int size)
    {
        // your code here
        int count =0;
        int element= 0;

        for(int i=0;i<a.length;i++){
            if(count ==0){
                count =1;
                element = a[i];
            }
            else if(a[i]==element){
                count++;
            }
            else{
                count--;
            }

        }
        int count1=0;
        for(int i=0;i<a.length;i++){
            if(element==a[i]){
                count1++;
            }
        }
        if(count1>size/2){
            return element;
        }


        return -1;


    }
}
