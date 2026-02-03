package Strings;
public class RemoveWordsInAString {
    public static void main(String[] args) {
        String st="the sky is     blue";
        String[] s=st.trim().split("st");
        String a="";
        for(int i=s.length-1;i>=0;i--){
            a+=s[i];
            if(i!=0){
                a+=" ";
            }
        }
        System.out.println(a);
    }
}
