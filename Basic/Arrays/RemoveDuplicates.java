package Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int a[]={1,2,4};
        HashSet <Integer> set=new HashSet<>();
        for(int i=0;i<a.length;i++){
            set.add(a[i]);
        }
        System.out.println(set);
    }
}
