package Arrays;

import java.util.Arrays;

public class mergeSortedArray {
    public static void main(String[] args) {
        int nums1[]={1,2,3,0,0,0};
        int m=3;
        int n=3;
        int z=0;
        int nums2[]={2,5,6};
        for(int i=m;i<m+n;i++){
           nums1[i]=nums2[z];
            z++;
        }
        Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1));
    }
}
