package Searching.Binary;

public class FloorSortedArray {
    public static void main(String[] args) {
        int a[]={2,4,6,8,10};
        int target=32;
        int index=-1;
        int start=0;
        int end=a.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(a[mid]==target){
                index=mid;
                
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
