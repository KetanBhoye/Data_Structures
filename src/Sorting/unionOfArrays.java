package Sorting;

import java.util.Arrays;

public class unionOfArrays {
    public static void main(String[] args){
     int[] arr1 = {3,5,8};
     int[] arr2 = {2,8,9,10,15};
   //  new unionOfArrays(arr1,arr2);
        optimalunionOfArrays(arr1,arr2);
    }
    unionOfArrays(int arr1[], int arr2[]){
        int aux[] = new int[arr1.length+arr2.length];
        for(int i = 0; i < arr1.length; i++) {
            aux[i]=arr1[i];
        }
        for(int i = arr1.length; i <aux.length ; i++) {
            aux[i]=arr2[i-arr1.length];
        }
    Arrays.sort(aux);
    for(int i = 1; i <aux.length ; i++) {
        if(aux[i]!=aux[i-1]){
        System.out.println(aux[i-1]);
        }
    }
            }

    public static  void  optimalunionOfArrays(int a[],int b[]){
        int m = a.length;
        int n = b.length;
        int i=0,j=0;
        while(i<m && j<n){
            if(i>0 && a[i-1]==a[i]){i++;continue;}
            if(j>0 && b[j-1]==b[j]){j++;continue;}
            if(a[i]<b[j]){System.out.print(a[i]+" ");i++;}
            else if(a[i]>b[j]){System.out.print(b[j]+" ");j++;}
            else{System.out.print(a[i]+" ");i++;j++;}
        }
        while(i<m){if(i==0||a[i]!=a[i-1])System.out.print(a[i]+" ");i++;}
        while(j<n){if(j==0||b[j]!=b[j-1])System.out.print(b[j]+" ");j++;}
    }

        }



