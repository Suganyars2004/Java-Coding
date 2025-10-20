package Sorting;

public class selectionSort {
   public static void main(String[] args) {
       int nums[]={5,2,3,1,8,4};
       for(int i=0;i<nums.length;i++)
       {
        int z=i;
        int min=nums[i];
          for(int j=i+1;j<nums.length;j++){
            if(nums[j]<min){
                min=nums[j];
                z=j;
            }
          }
          int temp=nums[i];
          nums[i]=nums[z];
          nums[z]=temp;
       }
       for(int i:nums){
        System.out.println(i);
       }
   } 
}
