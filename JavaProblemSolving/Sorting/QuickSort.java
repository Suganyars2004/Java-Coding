package Sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int a[]={1,5,3,8,4,2,7,10};
        quick(a,0,a.length-1);

            System.out.print(Arrays.toString(a));
    }
    static void quick(int arr[],int low,int high){
      if(low>=high){
        return;
      }
      int pivot=arr[low];
      int i=low;
      int j=high;
      while(i<j){
        while(i<=high && arr[i]<=pivot){
            i++;
        }
        while(j>=low && arr[j]>pivot){
            j--;
        }
        if(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        }
        int temp=arr[j];
        arr[j]=arr[low];
        arr[low]=temp;
        quick(arr,low,j-1);
        quick(arr, j+1,high);
    }
}