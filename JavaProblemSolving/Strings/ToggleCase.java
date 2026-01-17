package Strings;
//change upper to lower case and vice verse
public class ToggleCase {
    public static void main(String[] args) {
        String a="aBc";
        String result="";
        for(int i=0;i<a.length();i++){
            char b=a.charAt(i);
           if(Character.isUpperCase(b)){
            result+=Character.toLowerCase(b);
           }
           else{
            result+=Character.toUpperCase(b);
           }
        }
        System.out.println(result);
    }
}
