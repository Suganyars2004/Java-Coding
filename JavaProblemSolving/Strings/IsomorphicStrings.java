package Strings;

import java.util.HashMap;

public class IsomorphicStrings {
    public static void main(String[] args) {
        String a="egg";
        String b="add";
        boolean ans=Isomorphic(a, b);
        System.out.println(ans);

    }
    static boolean Isomorphic(String a,String b){
        HashMap<Character,Character> map1=new HashMap<>();
        HashMap<Character,Character> map2=new HashMap<>();
        if(a.length()!=b.length()){
            return false;
        }
        
        for(int i=0;i<a.length();i++){
            char x=a.charAt(i);
            char y=b.charAt(i);
            if(map1.containsKey(x)&&map1.get(x)!=y){
             return false;   
            } else if(map2.containsKey(y)&&map2.get(y)!=x){
             return false;   
            }
                map1.put(x, y);
                map2.put(y, x);
        
        }
        return true;
    }
}