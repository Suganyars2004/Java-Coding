package Arrays.medium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
      int nums[]={9,1,-3,2,4,8,3,-1,6,-2,-4,7};
      Set<Integer> set=new TreeSet<>();
      for(int i:nums){
        set.add(i);
      }  
      int count=1,maxcount=0;
      List<Integer> list=new ArrayList<>(set);
      for(int i=1;i<list.size();i++){
           if((list.get(i-1))==(list.get(i)-1)){
              count++;
           }
           else{
            if(count>=maxcount){
                maxcount=count;
            }
             count=1;
           }
      }
       if(count>maxcount){
                maxcount=count;
          }
      System.out.println(maxcount);
    }
}
