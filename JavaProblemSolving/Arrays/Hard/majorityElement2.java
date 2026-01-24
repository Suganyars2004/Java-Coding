package Arrays.Hard;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class majorityElement2 {
    public static void main(String[] args) {
        int nums[]={3,2,3,2,1};
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
            map.put(nums[i],1); 
            }
        }
        List<Integer> list=new ArrayList<>();
        int size=nums.length/3;
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
           int key=entry.getKey();
           int value=entry.getValue();
           if(value>size){
            list.add(key);
           }
        }
        System.out.println(list);
    }
}
