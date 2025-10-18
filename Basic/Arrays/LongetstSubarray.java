package Arrays;

import java.util.HashMap;

public class LongetstSubarray {
    public static void main(String[] args) {
        int arr[] = {10, 5, 2, 7, 1, -10};
        int k = 15;
        int result=longest(arr,k);
        System.out.println(result);
    }
    static int longest(int arr[],int k){
        int sum=0;
        int maxLen=0;
       HashMap <Integer,Integer> map=new HashMap<>();
       for(int i=0;i<arr.length;i++){
         sum+=arr[i];
         if(sum==k){
            maxLen=i+1;
         }
         if(map.containsKey(sum-k)){
            maxLen=Math.max(maxLen, map.get(sum-k));
            
         }
         if(!map.containsKey(sum)){
            map.put(sum, i);
         }
       }
       return maxLen;
    }
}
