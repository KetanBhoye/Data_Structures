package Heap;

public class MinHeap {

    int[] arr;
    int size;
    int capacity;

    MinHeap(int n){
        arr = new int[n];
        size = 0;
        capacity = n;
    }

   public int left(int i){
        return (2*i+1);
    }
    public int right(int i){
        return (2*i+2);
    }
    public int parent(int i){
        return(i-1)/2;
    }

    void insert(int x){
    if(size==capacity){
        return;
    }
    size++;
    arr[size-1]=x;
    for(int i = size-1;i!=0&& arr[parent(i)]>arr[i];){
        int temp = arr[i];
        arr[i] = arr[parent(i)];
        arr[parent(i)] = temp;
        i = parent(i);
    }
    }

}
