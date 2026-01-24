package Arrays.medium;

import java.util.Arrays;
import java.util.HashMap;
public class twosum {
    public static void main(String[] args) {
        int a[]={11,2,8,15,7};
        int target=9;
        int b[]=twosum(a,target);
        System.out.println(Arrays.toString(b));
    }
    static int[] twosum(int a[],int target){
        HashMap <Integer,Integer> map=new HashMap<>();
        int result=0;
        for(int i=0;i<a.length;i++){
           result=target-a[i];
           if(map.containsKey(result)){
            return new int[]{map.get(result),i};
           }
           map.put(a[i], i);
        }
        return new int[]{};
    }
}
