package Arrays.Strings;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
       String a="nagaram";
       String b="anagram";
       boolean z=anagram(a,b); 
       if(z==true){
        System.out.println("valid anagram");
       }
       else{
        System.out.println("not a valid anagram");
       }
    }
    static boolean anagram(String a,String b){
        if(a.length()!=b.length()){
            return false;
        }
        char x[]=a.toCharArray();
        char y[]=b.toCharArray();
        Arrays.sort(x);
        Arrays.sort(y);
        if(Arrays.equals(x,y)){
            return true;
        }   
    return false; }
}
