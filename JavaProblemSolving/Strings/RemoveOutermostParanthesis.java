package Strings;

public class RemoveOutermostParanthesis {
    public static void main(String[] args) {
        String a="((()))(())";
        int counter=0;
        String b="";
        for(int i=0;i<a.length();i++){
           if(a.charAt(i)=='('){
            counter++;
            if(counter>1){
                b+=a.charAt(i);
            }
           }
           else{
            counter--;
            if(counter>0){
                b+=a.charAt(i);
            }
           }
        }
        System.out.println(b);
    }
}
