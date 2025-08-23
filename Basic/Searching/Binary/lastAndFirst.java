package Searching.Binary;

public class lastAndFirst {
    public static void main(String[] args) {
        int nums[]={1,5,7,7,7,7,8};
        int target=7;
        int n[]=searchRange(nums,target);
        for(int i:n){
            System.out.print(i+" ");
        }
    }
    public static int[] searchRange(int[] nums, int target) {
        int start=0;
        int n[]={-1,-1};
        int end=nums.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(nums[mid]==target){
                for(int i=mid;i>=0;i--){
                    if(nums[i]==target){
                        n[0]=i;
                    }
                    else{
                        break;
                    }
                }
                for(int j=mid;j<nums.length;j++){
                    if(nums[j]==target){
                        n[1]=j;
                    }
                    else{
                        break;
                    }
                }
                return n;
            }
            else if(nums[mid]<target){
                start=mid+1;
                        }
            else{
                end=mid-1;
            }     
        }
        return n;
    }
}
