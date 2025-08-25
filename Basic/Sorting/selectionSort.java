package Sorting;

public class selectionSort {
   public static void main(String[] args) {
       int nums[]={5,2,3,1,8,4};
        int start=nums.length-1;
        while(start!=0){
            int max=nums[0];
            int index=0;
            for(int i=1;i<=start;i++){
                if(nums[i]>max){
                    max=nums[i];
                    index=i;
                }
            }
            int temp=nums[start];
            nums[start]=max;
            nums[index]=temp;
            start--;
        }
        for(int i:nums){
            System.out.print(i);
        }
   } 
}
