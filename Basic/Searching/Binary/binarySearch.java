package Searching.Binary;

public class binarySearch {
    public static void main(String[] args) {
        int a[]={2,5,7,12,32,43};
        int target=32;
        int index=-1;
        int start=0;
        int end=a.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(a[mid]==target){
                index=mid;
                break;
            }
            else if(a[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        System.out.println(index);
    }
}
