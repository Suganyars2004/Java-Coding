package Arrays;

import java.util.Arrays;

//do my swapping first and last
public class reverse {
    public static void main(String[] args) {
        int a[]={3,5,2,9,88};
        reversing(a);
        System.out.println(Arrays.toString(a));
    }
    static void reversing(int a[]){
       int start=0;
       int end=a.length-1;
       while(start<end){
        int temp=a[start];
        a[start]=a[end];
        a[end]=temp;
        start++;
        end--;
       }
    }
}
