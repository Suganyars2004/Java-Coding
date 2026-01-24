package Arrays.easy;

public class CheckIfArrayIsSortedAndRotated {
    public static void main(String[] args) {
        int nums[]={3,4,1,5,2};
        System.out.println(sort(nums));
        
    }
    public static boolean sort(int nums[]){
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>nums[(i+1)%nums.length]){
                count++;
            }
            if(count>1){
                return false;
            }

        }
        return true;
    }
}
