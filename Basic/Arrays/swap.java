package Arrays;

import java.util.Arrays;

public class swap {
    public static void main(String[] args) {
        int a[]={23,65,77,32,99};
        swap(a,0,1);
        System.out.println(Arrays.toString(a));
    }
    static void swap(int a[],int start,int end){
        int temp=a[start];
        a[start]=a[end];
        a[end]=temp;
    }
}
