package TwoPointer;

import java.util.Arrays;

public class ThreeSum {
    public static void main(String[] args) {
        int a[]={-1,0,1,2,-1,4};
        boolean res=three(a);
        System.out.println(res);
    }
 static boolean three(int a[]){
    Arrays.sort(a);
    for(int i=0;i<a.length;i++){
            int left=i+1;
            int right=a.length-1;
            while (left<right) {
                int sum=a[i]+a[left]+a[right];
                if(sum==0){
                    return true;
                }
                else if(sum>0){
                    right--;
                }
                else{
                    left++;
                }
            }
        }
        return false;
 }
}
