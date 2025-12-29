package Recursion;

public class reverseAnArray {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        reverse(0,a,a.length);
        for(int i:a){
            System.out.print(i);
        }
    }
    static void reverse(int i,int arr[],int n){
        if(i>=n/2){
            return;
        }
        swap(arr,i,n-i-1);
        reverse(i+1, arr, n);
    }
    static void swap(int arr[],int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
