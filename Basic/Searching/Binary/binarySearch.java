package Searching.Binary;

public class binarySearch {
    public static void main(String[] args) {
        int a[]={2,5,7,12,32,43};
        int target=0;
        int result =binary(a,target);
        System.out.println(result);
    }
    static int binary(int a[],int target){
        int start=0;
        int end=a.length-1;
        while(start<end){
            int mid=(start+end)/2;
            if(a[mid]==target){
                return mid;
            }
            else if(a[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
}
