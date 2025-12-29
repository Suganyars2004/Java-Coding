package Strings;

public class RemoveVowels {
    public static void main(String[] args) {
        String a="programming";
        String b="";
        
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)=='a'||a.charAt(i)=='e'||a.charAt(i)=='i'||a.charAt(i)=='o'||a.charAt(i)=='u'){
                continue;
            }
            else{
                b+=a.charAt(i);
            }
        }
        System.out.println(b);
    }
}
