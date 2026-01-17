package Patterns;

public class onescomplement {
    public static void main(String[] args) {
        int n=2;
        String s="10";
        String a="";
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='0'){
                a+="1";
            }
            else{
                a+="0";
            }
        }
        System.out.println(a);
    }
}
