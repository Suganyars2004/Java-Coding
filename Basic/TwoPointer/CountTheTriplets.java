package TwoPointer;

import java.util.Arrays;

public class CountTheTriplets {
    public static void main(String[] args) {
        int arr[]={1,5,3,2};
        int result=count(arr);
        System.out.println(result);
    }
    static int count(int[] arr){
      Arrays.sort(arr);
      int count=0;
      for(int i=0;i<arr.length;i++){
        int left=0;
        int right=arr.length-1;
        while(left<right){
            if(arr[left]+arr[right]==arr[i]){
               count++;
               left++;
               right--;
            }
            else if(arr[left]+arr[right]<arr[i]){
                left++;
            }
            else{
                right--;
            }
        }
      }
      return count;
    }
}