package Arrays;

import java.util.HashSet;

public class UnionOfTwoArrays {
   public static void main(String[] args) {
    int a[]={1,2,1,1,2};
    int b[]={2,2,1,2,1};
    HashSet<Integer> set=new HashSet<>();
    for(int i:a){
        set.add(i);
    }
    for(int i:b){
        set.add(i);
    }
   System.out.println(set);
   } 
}
