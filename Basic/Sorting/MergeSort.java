package Sorting;

import java.sql.Array;
import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int arr[]={1,5,3,0,9,6};
        divide(arr,0,arr.length);
         System.out.println(Arrays.toString(arr));
    }
    public static void divide(int arr[],int start,int end){
        if(start>=end){
            return;
        }
        int mid=(start+end)/2;
        divide(arr, start, mid);
        divide(arr, mid+1, end);
        sorting(arr,start, mid, end);
    }
    public static void sorting(int arr[],int start,int mid,int end){
        int a[]=new int[arr.length];
        int i=start,j=mid+1,k=start;
         while(i<=mid && j<=end){
            if(arr[i]<arr[j]){
                a[k]=arr[i];
                i++;
                k++;
            }
            else{
                a[k]=arr[j];
                j++;
                k++;
            }
         }
         while(i<=mid){
            a[k]=arr[i];
            i++;
            k++;
         }
          while(j<end){
            a[k]=arr[j];
            j++;
            k++;
         }
         for(int io=start;io<end;io++){
            arr[io]=a[io];
         }
      
    }
}
