package Searching.Binary;

public class CeilSortedArray {
    public static void main(String[] args) {
        int a[]={2,4,6,8,10};
        int target=12;
        int index=-1;
        int start=0;
        int end=a.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(a[mid]==target){
                index=a[mid];
                end=mid-1;
            }
            else if(a[mid]<target){
                start=mid+1;
            }
            else{
                index=a[mid];
                end=mid-1;
            }
        }
        System.out.println(index);
    }  
}
