package Arrays.medium;

public class maximumSubarray {
    public static void main(String[] args) {
        int nums[]={-2,-3,-7,-2,-10,-4};
        int sum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(sum>maxSum){
                maxSum=sum;
            }
            if(sum<0){
                sum=0;
            }
        }
        System.out.println(maxSum);
    }
}
