package Arrays;

import java.util.Arrays;

public class moveZeros {
    public static void main(String[] args) {
        int nums[]={0,1,0,3,12};
        int nonzero=0;
        int zero=0;
        while(nonzero<nums.length){
            if(nums[nonzero]!=0){
                int temp=nums[nonzero];
                nums[nonzero]=nums[zero];
                nums[zero]=temp;
                nonzero++;
                zero++;
            }
            else{
                nonzero++;
            }
            
        }
        System.out.println(Arrays.toString(nums));
    }
}
