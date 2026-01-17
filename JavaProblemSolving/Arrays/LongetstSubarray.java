package Arrays;
import java.util.HashMap;
public class LongetstSubarray {
    public static void main(String[] args){
        int arr[] = {1,2,1,2,1};
        int k = 3;
        int result=longest(arr,k);
        System.out.println(result);
    }
    static int longest(int arr[],int k){
        int sum=0;
        int maxLen=0;
        HashMap <Integer,Integer> map=new HashMap<>();
        map.put(0,-1);
       for(int i=0;i<arr.length;i++){
         sum+=arr[i];
         if(map.containsKey(sum-k)){
            maxLen=Math.max(maxLen,i-map.get(sum-k));
         }
            map.putIfAbsent(sum, i);
       }
       return maxLen;
    }
}