package Hashing;

import java.util.HashMap;

public class CountingFrequency {
    public static void main(String[] args) {
        int a[]={1,2,2,1,3};
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<a.length;i++){
            if(map.containsKey(a[i])){
                map.put(a[i],map.get(a[i])+1);
            }
            else{
            map.put(a[i], 1);
            }
        }
        System.out.println(map);
    }
}
