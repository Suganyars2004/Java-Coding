package Strings;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String strs[]={"flower","flight","fow"};
        String ans=prefix(strs);
        System.out.println(ans);
    }
    static String prefix(String[] strs){
        String ans="";
        Arrays.sort(strs);
        String first=strs[0];
        String last=strs[strs.length-1];
        for(int i=0;i<first.length();i++){
            if(first.charAt(i)==last.charAt(i)){
                ans+=first.charAt(i);
            }
            else{
                break;
            }
        }
        return ans;
    }
}
