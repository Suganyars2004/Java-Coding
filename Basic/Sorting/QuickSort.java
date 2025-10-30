package Sorting;

public class QuickSort {
    public static void main(String[] args) {
        int a[]={5,3,8,4,2,7,10};
        quick(a);
    }
    static void quick(int arr[]){
      int pivot=arr[0];
      int i=0;
      int j=arr.length-1;
      while(i<j){
        while(arr[i]<=pivot){
            i++;
        }
        while(arr[j]>pivot){
            j--;
        }
        if(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
      }
      int temp=arr[j];
      arr[j]=pivot;
      pivot=temp;
    }
}