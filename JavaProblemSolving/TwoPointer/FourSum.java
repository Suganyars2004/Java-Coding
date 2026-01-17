package TwoPointer;
import java.util.Arrays;

public class FourSum {
    public static void main(String[] args) {
        int a[]={1,0,-1,0,-2,2};
        int target=0;
        Arrays.sort(a);
        for(int i=0;i<a.length;i++){
            int left=i+1;
            int right=a.length-1;
            while(left<right){
            if(a[i]+a[left]+a[right]+a[right-1]==target){
                System.out.println(a[i]+","+a[left]+","+a[right]+","+a[right-1]);
            }
            else if(a[i]+a[left]+a[right]+a[right-1]<target){
                left++;
            }
            else{
                right--;
            }
        }
        }
    }
}
