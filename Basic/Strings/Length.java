package Strings;
//length without len function
public class Length {
    public static void main(String[] args) {
        String a="programming";
        int count=0;
        char b[]=a.toCharArray();
        for(char c:b){
            count++;
        }
        System.out.println(count);
    }
}