package Searching.Binary;
public class findPeek {
    public static void main(String[] args) {
        int a[]={0,1,2,3,1,0};
        int start=0;
        int end=a.length-1;
        while(start<end){
           int mid=(start+end)/2;
           if(a[mid]>a[mid+1]){
            end=mid;
           }
           else{
            start=mid+1;
           }

        }
        System.out.println(end);
    }}
