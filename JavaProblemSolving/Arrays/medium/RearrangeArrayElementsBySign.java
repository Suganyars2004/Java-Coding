package Arrays.medium;

import java.util.Arrays;

public class RearrangeArrayElementsBySign {
    public static void main(String[] args) {
        int nums[]={3,1,-2,-5,2,-4};
        int res[]=new int[nums.length];
        int pos=0;
        int neg=1;
        for(int i:nums){
            if(i>0){
                res[pos]=i;
                pos+=2;
            }
            else{
                res[neg]=i;
                neg+=2;
            }
        }
      
        System.out.println(Arrays.toString(res));
    }
}