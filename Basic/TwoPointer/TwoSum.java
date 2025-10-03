package TwoPointer;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int a[]={0,-1,2,-3,1};
        int target=-2;
        int[] result=twosum(a,target);
        for(int i=0;i<result.length;i++){
            System.out.println(result[i]);
        }
    }
    static int[] twosum(int a[],int target){
       HashMap<Integer,Integer> map=new HashMap<>();
       for(int i=0;i<a.length;i++){
        int res=target-a[i];
        if(map.containsKey(res)){
            return new int[]{map.get(res),i};//because returning complent oda index and i value
        }
        map.put(a[i],i);
       }
       return new int[]{};
    }
}
