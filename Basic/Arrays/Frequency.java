package Arrays;
import java.util.HashMap;
public class Frequency {
    public static void main(String[] args) {
        int a[]={1,1,2,3,1};
        HashMap <Integer,Integer> map=new HashMap<>();
        for(int i=1;i<=a.length;i++){
            map.put(i,0);
        }
        for(int i=0;i<a.length;i++){
            if(map.containsKey(a[i])){
                map.put(a[i],map.get(a[i])+1);
            }
            else{
                map.put(a[i],1);
            }
        }
     System.out.println(map);   
    }
}