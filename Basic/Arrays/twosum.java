package Arrays;

import java.util.Arrays;
public class twosum {
    public static void main(String[] args) {
        int a[]={11,2,8,15,7};
        int target=9;
        int b[]=twosum(a,target);
        System.out.println(Arrays.toString(b));
    }
    static int[] twosum(int a[],int target){
        int start=0;
        int b[]=new int[2];
        while(start<a.length){
            for(int i=start+1;i<a.length;i++){
                if(a[i]+a[start]==target){
                    b[0]=start;
                    b[1]=i;
               
                }
            }
            start++;
        }
        return b;
    }
}
