package Arrays;

import java.util.HashMap;

public class ArraySubstOfAnother {
    public static void main(String[] args) {
        int a[]={11,7,1,13,21,3,7,3};
        int b[]={11,3,7,1,7};
        boolean res=true;
       HashMap <Integer,Integer> map=new HashMap<>();
        for(int i=0;i<a.length;i++){
          if(map.containsKey(a[i])){
            map.put(a[i],map.get(a[i])+1);
          }
          else{
          map.put(a[i],1);
          }
        }
        for(int i=0;i<b.length;i++){
            if(map.containsKey(b[i])&&(map.get(b[i])>0)){
                map.put(b[i],map.get(b[i])-1);
              }
            else{
              res=false;
              break;
        }
            res=true;
      }
        System.out.println(res);
    }
}
