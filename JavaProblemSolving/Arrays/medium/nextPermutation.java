package Arrays.medium;

import java.util.Arrays;

public class nextPermutation {
    public static void main(String[] args) {
        int a[]={2,1,5,4,3,0,0};
        int index=-1;
        for(int i=a.length-2;i>=0;i--){
            if(a[i]<a[i+1]){
                index=i;
                break;
            }
        }
        if(index!=-1){
        for(int i=a.length-1;i>=index;i--){
            if(a[i]>a[index]){
                int temp=a[i];
                a[i]=a[index];
                a[index]=temp;
                break;
            }
        }
    }
       int l=index+1;
       int r=a.length-1;
       while(l<r){
        int temp=a[l];
        a[l]=a[r];
        a[r]=temp;
        l++;
        r--;
       }
        System.out.println(Arrays.toString(a));
    }
}
