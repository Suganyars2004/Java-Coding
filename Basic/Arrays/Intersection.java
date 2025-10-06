package Arrays;

import java.util.HashMap;

public class Intersection {
    public static void main(String[] args) {
        int a[]={1,2,4,3,5,6};
        int b[]={3,4,5,6,7};
        int count=0;
        HashMap <Integer,Integer> map=new HashMap<>();
        for(int i:a){
            map.put(i, 0);
        }
        for(int i:b){
            if(map.containsKey(i)){
                count++;
            }
        }
        System.out.println(count);

    }
}
