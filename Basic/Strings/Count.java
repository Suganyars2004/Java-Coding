package Strings;

public class Count {
    public static void main(String[] args) {
        String a="programming";
        int vowels=0;
        int consonants=0;
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)=='a'||a.charAt(i)=='e'||a.charAt(i)=='i'||a.charAt(i)=='o'||a.charAt(i)=='u'){
                 vowels++;
            }
            else{
                consonants++;
            }
        }
        System.out.println("vowels:"+vowels);
        System.out.println("Consonants:"+consonants);
    }
}
