package Arrays;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int nums[]={1,0,1,1,0,1,1,1};
        int max=0;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                sum++;
            }
            else{
                if(max<sum){
                   max=sum;
                }
                  sum=0;
            }
        }
        if(max<sum){
                   max=sum;
                }
        System.out.println(max);
    }
}
